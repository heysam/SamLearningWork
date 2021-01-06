
## List
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BookListRazor/BookListRazor/Images/pageBookList.png)
## DataTable
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BookListRazor/BookListRazor/Images/pageDataTable.png)
## Create Page
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BookListRazor/BookListRazor/Images/pageCreate.png)
## Edit Page
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BookListRazor/BookListRazor/Images/pageEdit.png)

## 環境
* IDE:Visual studio for Mac
* Azure Data Studio
* SQL: Docker MSSQL SERVER 2019
* C# .netcore 3.1


使用Visual Studio for MAC 的IDE 創建一個 .NET core Project 實現跨系統開發  
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BookListRazor/BookListRazor/Images/githubpicture/NEW1.jpg)
.csproj
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BookListRazor/BookListRazor/Images/githubpicture/NEW2.jpg)
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BookListRazor/BookListRazor/Images/githubpicture/NEW3.jpg)
當NuGet新增套件時，這裡會跟著修改，右鍵編輯專案檔案可直接直接修改
安裝的套件
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BookListRazor/BookListRazor/Images/githubpicture/NEW6.jpg)



### Ｍodel Book.cs檔案
```C#
namespace BookListRazor.Model
{
    public class Book
    {
        [Key]//表示唯一標識實體的一個或多個屬性。
        public int Id { get; set; }

        [Required]//指定需要一個數據字段值。
        public string Name { get; set; }
        public string Author { get; set; }
    }
}

```
### startup.cs檔案新增
```C#
        public void ConfigureServices(IServiceCollection services)
        {
            services.AddDbContext<ApplicationDbContext>(options => options.UseSqlServer(Configuration.GetConnectionString("DefaultConnection")));
            services.AddRazorPages();
        }
```
### Ｍodel ApplicationDbContext.cs檔案
```C#
namespace BookListRazor.Model
{
    public class ApplicationDbContext : DbContext  //繼承
    {
        public ApplicationDbContext(DbContextOptions<ApplicationDbContext> options):base(options)
        {
        }
        public DbSet<Book> Book { get; set; } //要在startup.cs加上
                                              //add-migration
                                              //再update-database
    }
}

```
### Migtations
在Nuget PackageManager Console 下command  
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BookListRazor/BookListRazor/Images/githubpicture/NEW7.jpg)

add-migration [檔案名稱]   產生檔案  
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BookListRazor/BookListRazor/Images/githubpicture/NEW4.jpg)

update-database 更新創建到資料庫  
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BookListRazor/BookListRazor/Images/githubpicture/NEW5.jpg)

### _Layout.cshtml
```HTML
<li class="nav-item">
      <a class="nav-link text-dark" asp-area="" asp-page="/BookList/Index">BookList</a>
</li>
```
### Pages/BookList/Index.cshtml.cs
```C#
    public class IndexModel : PageModel
    {
        private readonly ApplicationDbContext _db;

        public IndexModel(ApplicationDbContext db)
        {
            _db = db;

        }
        public IEnumerable<Book> Books { get; set; }

        public async Task OnGet() //Task表示異步操作。
        {
            Books = await _db.Book.ToListAsync();
            //ToListAsync 通過異步枚舉從IQueryable <out T>異步創建List <T>。
            //回傳：代表異步操作的任務。 任務結果包含一個List <T>，其中包含來自輸入序列的元素。
        }
    }
```
# INDEX
### Pages/BookList/Index.cshtml
```HTML
@page
@model BookListRazor.Pages.BookList.IndexModel
@{
    ViewData["Title"] = "Index";
}
<br />
<div class="container row p-0 m-0">
    <div class="col-9">
        <h2 class="text-info">Book List</h2>
    </div>
    <div class="col-3">
        <a class="btn btn-info form-control text-white">Create New Book</a>
    </div>
    <div class="col-12 border p-3 mt-3">
        <form method="post">
            @if (Model.Books.Count() > 0)
            {
                <table class="table table-striped border">
                    <tr class="table-secondary">
                        <th>
                            <label asp-for="Books.FirstOrDefault().Name"></label>
                        </th>
                        <th>
                            @*@Html.DisplayNameFor(m => m.Books.FirstOrDefault().Author)*@
                            <label asp-for="Books.FirstOrDefault().Author"></label>
                        </th>
                        <th>

                        </th>
                    </tr>
                    @foreach(var item in Model.Books)
                    {
                        <tr>
                            <td>
                                @Html.DisplayFor(m=>item.Name)
                            </td>
                            <td>
                                @Html.DisplayFor(m=>item.Author)
                            </td>
                        </tr>
                    }
                </table>
            }
            else
            {
                <p>No books available.</p>
            }
        </form>
    </div>
</div>
```
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BookListRazor/BookListRazor/Images/githubpicture/pageCreate1.png)



# CREATE
### index.html
```HTML
 <a asp-page="Create" class="btn btn-info form-control text-white">Create New Book</a>
@*asp-page將href指定到Razor Page的頁面*@ 
```

### Create.cshtml.cs
```C#
   public class CreateModel : PageModel
    {
        private readonly ApplicationDbContext _db;
        public CreateModel(ApplicationDbContext db)
        {
            _db = db;
        }

        [BindProperty]
        public Book Book { get; set; }

        public void OnGet()
        {
        }

        public async Task<IActionResult> OnPost() //本來帶入用OnPost(Book bookObj)因有[BindProperty]
        {
            if (ModelState.IsValid)
            {
                await _db.Book.AddAsync(Book);
                await _db.SaveChangesAsync();
                return RedirectToPage("Index");
            }
            else
            {
                return Page();
            }
        }
    }
```
IActionResult 接口 可返回任意型式的Action View、Object、string等  
Action也提供非同步(async)方式，將回傳包裝成Task<IactionResult>  
Async非同步方法:非同步對於可能在像是 Web 存取時會進行封鎖的活動而言相當重要。 存取 Web 資源的速度有時會變慢或延遲。 如果這類活動在同步處理序中遭到封鎖，整個應用程式就必須等候。 在非同步處理序中，應用程式可以繼續處理其他與 Web 資源不相關的工作，直到可能的封鎖工作完成。  
Async需搭配await，若沒有使用await運算子來標記暫停點，無論修飾子為何，方法都會已同步方法執行async  
  
 ### Create.cshtml
 ```html
<form method="post">
        <div class="text-danger" asp-validation-summary="ModelOnly"></div>
        @*Name*@
        <div class="form-group row">
            <div class="col-2">
                <label asp-for="Book.Name"></label>
            </div>
            <div class="col-6">
                <input asp-for="Book.Name" class="form-control" />
            </div>
            <span asp-validation-for="Book.Name" class="text-danger"></span>
        </div>
        @*Author*@
        <div class="form-group row">
            <div class="col-2">
                <label asp-for="Book.Author"></label>
            </div>
            <div class="col-6">
                <input asp-for="Book.Author" class="form-control" />
            </div>
            <span asp-validation-for="Book.Author" class="text-danger"></span>
        </div>
        @*ISBN*@
        <div class="form-group row">
            <div class="col-2">
                <label asp-for="Book.ISBN"></label>
            </div>
            <div class="col-6">
                <input asp-for="Book.ISBN" class="form-control" />
            </div>
            <span asp-validation-for="Book.ISBN" class="text-danger"></span>
        </div>

        <div class="form-group row">
            <div class="col-3 offset-3">
                <input type="submit" value="Create" class="btn btn-primary form-control" />
            </div>
            <div class="col-3">
                <a asp-page="Index" class="btn btn-success form-control">Back to List</a>
            </div>
        </div>
    </form>
```
asp-page 導向定義好的Page  asp-page="Index"  
asp-validation-for 驗證消息標籤 asp-validation-for="Book.Name"  
asp-validation-summary 驗證摘要標籤 asp-validation-summary="ModelOnly"  

# Edit
### Index.cshtml
```html
 <a asp-page="Edit" asp-route-id="@item.Id" class="btn btn-success btn-sm text-white">Edit</a>
```
### Edit.cshtml
```html
 <input type="hidden" asp-for="Book.Id" />
```
### Edit.cshtml.cs
```C#
       public class EditModel : PageModel
    {
        private ApplicationDbContext _db;
        public EditModel (ApplicationDbContext db)  
        {
            _db = db;
        }

        [BindProperty] //資料繫結
        public Book Book { get; set; }

        public async Task OnGet(int id)
        {
            Book = await _db.Book.FindAsync(id); 
        }
        public async Task<IActionResult> OnPost()
        {
            if (ModelState.IsValid)  //ModelState模型繫結
            {
                var BookFromDb = await _db.Book.FindAsync(Book.Id); //FindAsync查找具有給定主鍵值的實體
                    //前端頁面記得加入Book.Id才找得到 <input type="hidden" asp-for="Book.Id" />
                BookFromDb.Name = Book.Name;
                BookFromDb.Author = Book.Author;
                BookFromDb.ISBN = Book.ISBN;

                await _db.SaveChangesAsync();
                return RedirectToPage("Index");
            }
            return RedirectToPage();
        }
    }
```
 [BindProperty] 的Attribute 與Model的Book Book 和.cshtml 的 asp-page、asp-route-id  呼應 

![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BookListRazor/BookListRazor/Images/githubpicture/pageEdit1.png)

# Delete
### Index.cshtml
```html
<button asp-page-handler="Delete" asp-route-id="@item.Id" onclick="return confirm('Are sure you want to delete?')" class="btn btn-danger btn-sm">Delete</button>
index.cshtml.cs
        public async Task<IActionResult> OnPostDelete(int id)
        {
            var book = await _db.Book.FindAsync(id);
            if(book == null)
            {
                return NotFound();
            }
            _db.Book.Remove(book);
            await _db.SaveChangesAsync();
            return RedirectToPage("Index");
        }
```
button加註asp-page-handler="Delete"，則IndexModel可宣告OnPostDelete()方法與其對應。   
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BookListRazor/BookListRazor/Images/githubpicture/pageDelete1.png)


# DataTable 呈現資料表
###  Controllers\BookController.cs
```C#
   [Route("api/Book")]
    [ApiController]
    public class BookController : Controller
    {
        private readonly ApplicationDbContext _db;

        public BookController(ApplicationDbContext db)
        {
            _db = db;
        }

        [HttpGet]
        // GET: /<controller>/
        public IActionResult GetAll()
        {
            //return View();
            return Json(new { data = _db.Book.ToList() }); //return Json (object)，將Json返回頁面
            //setup.cs要加上services.AddControllersWithViews();
            //setup.cs endpoints 加上endpoints.MapControllers();
        }

```
### index.cshtml
```html
    <div class="col-12 border p-3">
        <table id="DT_load" class="table table-striped table-bordered" style="width:100%">
            <thead> 
                <tr>
                    <th>Name</th>
                    <th>Author</th>
                    <th></th>
                </tr>
            </thead>
        </table>
    </div>
```
### Index.cshtml.cs
```
    public class IndexModel : PageModel
    {
        private readonly ApplicationDbContext _db;
        public IndexModel(ApplicationDbContext db)
        {
            _db = db;
        }
        public IEnumerable<Book> Books { get; set; }
        public async Task OnGet()
        {
            Books = await _db.Book.ToListAsync();
        }
    }
@section Scripts{
    <script src="~/js/bookList.js"></script>
}
```
### book.js
```js
var dataTable;
$(document).ready(function () {
    loadDataTable();
});
function loadDataTable() {
    dataTable = $('#DT_load').DataTable({
        "ajax": {
            "url": "/api/book",
            "type": "GET",
            "datatype": "json"
        },
        "columns": [   //columns要資料行一個一個設定，columnDefs則是多個資料行共用同一個設定
            { "data": "name", "width": "20%" }, //指定資料繫結名稱
            { "data": "author", "width": "20%" },
            //{ "data": "isbn", "width": "20%" },
            {
                "data": "id",    //data變數為id
                "render": function (data) { //”data”參數是指單元格cell的值
                    return `<div class="text-center">
                        <a href="/BookList/Edit?id=${data}" class='btn btn-success text-white' style='cursor:pointer; width:70px;'>Edit</a>
                        &nbsp;
                        <a class='btn btn-danger text-white' style='cursor:pointer; width:70px;'
                            onclick=Delete('/api/book?id='+${data})>Delete</a>
                        </div>`;
                }, "width": "40%"
            }
        ],
        "language": {
            "emptyTable": "no data found"
        },
        "width": "100%"
    });
}

```
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BookListRazor/BookListRazor/Images/githubpicture/pageDataTable.png)

