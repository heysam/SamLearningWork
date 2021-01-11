using System;
using BulkyBook.Models;

namespace BulkyBook.DataAccess.Repository.IRepository
{
    public interface ICategoryRepository : IRepository<Category>//Category => Models
    {
        void Update(Category category);

    }
}
