using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using BulkyBook.DataAccess.Repository.IRepository;
using BulkyBook.Models;
using Microsoft.AspNetCore.Mvc;

namespace BulkyBook.Areas.Admin.Controllers
{
    [Area("Admin")]
    public class CategoryController : Controller
    {
        private readonly IUnitOfWork _unitOfWork;
        public CategoryController(IUnitOfWork unitOfWork)
        {
            _unitOfWork = unitOfWork;
        }
        public IActionResult Index()
        {
            return View();
        }


        public IActionResult Upsert(int? id)
        {
            Category category = new Category();
            if(id == null)
            {
                //this is for create
                return View(category);
            }
            //this is for edit
            category = _unitOfWork.Category.Get(id.GetValueOrDefault());

            if (category == null)
            {
                return NotFound();
            }
            return View(category);
            //因return category 故前面model要引用BulkyBook.Models.Category

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
                    _unitOfWork.Category.Add(category);
                    //_unitOfWork.Save();
                    //沒辦法 Save 沒有在這個介面上
                    //所以要在IUnitOfWork.cs 加上Save()
                    //這樣CategoryRepository的update的 _db.SaveChanges();可以不用
                    //就直接在完成的時候存
                }
                else
                {
                    _unitOfWork.Category.Update(category);
                }
                _unitOfWork.Save();
                return RedirectToAction(nameof(Index));
            }
            return View(category);
        }


        #region API CALLS
        [HttpGet]
        public IActionResult GetAll()
        {
            //return NotFound();
            var allObj = _unitOfWork.Category.GetAll();
            return Json(new { data = allObj });
        }

        [HttpDelete]
        public IActionResult Delete(int id)
        {
            var objFromDb = _unitOfWork.Category.Get(id);
            if (objFromDb == null)
            {
                return Json(new { success = false, message = "Error while deleteing" });
            }
            _unitOfWork.Category.Remove(objFromDb);
            _unitOfWork.Save();
            return Json(new { success = true, message = "Delete Successful" });
            //前端ＪS要onclick
        }

        #endregion
    }
}