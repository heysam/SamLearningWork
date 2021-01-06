using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using BookListRazor.Model;
using Microsoft.AspNetCore.Mvc;

// For more information on enabling MVC for empty projects, visit https://go.microsoft.com/fwlink/?LinkID=397860

namespace BookListRazor.Controllers
{
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
            return Json(new { data = _db.Book.ToList() });
            //setup.cs要加上services.AddControllersWithViews();
            //setup.cs endpoints 加上endpoints.MapControllers();
        }
    }
}
