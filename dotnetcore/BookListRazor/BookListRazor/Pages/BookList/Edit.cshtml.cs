using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using BookListRazor.Model;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

namespace BookListRazor.Pages.BookList
{
    public class EditModel : PageModel
    {
        private ApplicationDbContext _db;
        public EditModel(ApplicationDbContext db)
        {
            _db = db;
        }

        [BindProperty] //資料繫結
        public Book Book { get; set; }

        public async Task OnGet(int id)     //OnPostAsync()=OnGet()
        {
            Book = await _db.Book.FindAsync(id);
        }
        public async Task<IActionResult> OnPost()
        {
            if (ModelState.IsValid)  //ModelState模型繫結
            {
                var BookFromDb = await _db.Book.FindAsync(Book.Id); //FindAsync查找具有給定主鍵值的實體
                                                                    //前端頁面記得加入Book.Id才找得到<input type="hidden" asp-for="Book.Id" />
                BookFromDb.Name = Book.Name;
                BookFromDb.Author = Book.Author;
                BookFromDb.ISBN = Book.ISBN;

                await _db.SaveChangesAsync();
                return RedirectToPage("Index");
            }
            return RedirectToPage();
        }
    }

}
