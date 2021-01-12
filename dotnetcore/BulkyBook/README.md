預設會有的Page
## Home Page
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BulkyBook/images/pageHome.png)

## Login Page
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BulkyBook/images/pageLogin.png)

## Register Page
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BulkyBook/pageRegister.png)

## 環境
* IDE:Visual studio for Mac
* Azure Data Studio
* SQL: Docker MSSQL SERVER 2019
* C# .netcore 5.0
* 實作MVC分層

## 目錄架構
### BulkyBook 下
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BulkyBook/tree.jpg)
Areas 下有各自的Area專案 專案下可以有各自的Controllers、Views等
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BulkyBook/treeAreas1.jpg)
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BulkyBook/treeAreas2.jpg)
Views 下有可設定整個網頁的_Layout還有部分檢視的部分等
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BulkyBook/treeView1.jpg)
wwwroot 下有Bootstrap js 等前端網頁頁面所使用的東西
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BulkyBook/treeWwwroot.jpg)
#### BulkyBook.DataAccess 下
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BulkyBook/treeDataAccessDB.jpg)
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BulkyBook/treeDataAccessRepository.jpg)
#### BulkyBook.Models 下
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BulkyBook/treeModels.jpg)
#### BulkyBook.Utility 下
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BulkyBook/treeUtility.jpg)


### 功能流程
* [CreateButton](#CreateButton) 


### 遇到的問題排除
* 目前卡在Areas新增 Scaffolder add MVC view controller using EF 無法選擇 Models下的Category models 先以手動新增頁面 ![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BulkyBook/error1.jpg)
* .reload 錯誤 Delete Jquery 無法正確從讀DataTable資料，確認DataTable是否正確Function![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BulkyBook/error2.jpg)![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BulkyBook/error3.jpg)




#CreateButton
### Category\Index.cshtml
Create New Category button
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BulkyBook/pageCategory.png)
```
    <div class="col-6 text-right">
        <a class="btn btn-primary" asp-action="Upsert"><i class="fas fa-plus"></i> &nbsp; Create New Category</a>
    </div>

```
### Category\Upset.cshtml
![image](https://github.com/heysam/SamLearningWork/blob/master/dotnetcore/BulkyBook/pageUpsert.png)
```@model BulkyBook.Models.Category
<form method="post">    
    <div class="row p-3 border">
        <div asp-validation-summary="ModelOnly" class="text-danager"></div>
@*這裡用0判斷是Create還是Edit 當Title*@
        @if (Model.Id != 0)
        {
            //edit
            title = "Edit Category";
        }
        <div class="col-12 border-bottom">
            <h2 class="text-primary">
                @title
            </h2>
        </div>
            <div class="form-group row">
                <div class="col-8 offset-4">
@*這裡用0判斷是Create還是Edit的按鈕時Create還是Edit*@
                    @if (Model.Id != 0)
                    {
		@*Edit的Button page*@
                        <partial name="_EditAndBackToListButton" model="Model.Id"/>

                    }
                    else
                    {
		@*Create的Button page*@
                        <partial name="_CreateAndBackToListButton" />
                    }
                </div>
            </div>
……
…
    </div>
</form>

```

### BulkyBook\Views\Shared\_CreateAndBackToListButton.cshtml
因在前面判斷Ｍodel.Id為0故用該_CreateAndBackToListButton.cshtml
```
<div class="row">
    <div class="col">
        <button type="submit" class="btn btn-primary form-control">Create</button>
    </div>
    <div class="col">
        <a asp-action="Index" class="btn btn-success form-control">Back to  List</a>
    </div>
</div>
```
### BulkyBook\Areas\Admin\CategoryControllers
當按下Create按鈕 會帶Id進來
```

        public IActionResult Upsert(int? id)
        {
            Category category = new Category();
            if(id == null)
            {
                //this is for create
                return View(category);
            }
		……..
…...
        }
        [HttpPost]
        [ValidateAntiForgeryToken]
        //form from another site that posts to my site in an
        //attempt to submit hidden content using an authenticated users credential
        public IActionResult Upsert(Category category)
        {
            if (ModelState.IsValid)
            {
                if (category.Id == 0)
                {
                    _unitOfWork.Category.Add(category);\\到Respository執行Add
                }
                else
                {
                    _unitOfWork.Category.Update(category);
                }
                _unitOfWork.Save();    \\到UnitOfWork的Save();
                return RedirectToAction(nameof(Index));
            }
            return View(category);
        }
```
### BulkyBook.DataAccess\Repository\Respository.cs
```
        public void Add(T entity)
        {
            //throw new NotImplementedException();
            dbSet.Add(entity); //ApplicationDbContext Categorties
        }
```
### BulkyBook.DataAccess\Repository\UnitOfWork.cs
```
    public class UnitOfWork : IUnitOfWork
    {
…..
…..
        public void Dispose()
        {
            _db.Dispose();
        }

        public void Save()
        {
            _db.SaveChanges();
        }
    }

```




