using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using BookListRazor.Model;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.EntityFrameworkCore;

namespace BookListRazor.Pages.BookList
{
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
    }
}

