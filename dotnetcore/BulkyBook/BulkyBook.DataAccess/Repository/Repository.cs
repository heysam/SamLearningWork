﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using BulkyBook.DataAccess.Data;
using BulkyBook.DataAccess.Repository.IRepository;
using Microsoft.EntityFrameworkCore;

namespace BulkyBook.DataAccess.Repository
{
    public class Repository<T> : IRepository<T> where T : class
    {
        //private readonly DbContext _db;
        private readonly ApplicationDbContext _db;
        internal DbSet<T> dbSet;

        public Repository(ApplicationDbContext db)
        {
            _db = db;
            this.dbSet = db.Set<T>();

        }
        public void Add(T entity)
        {
            //throw new NotImplementedException();
            dbSet.Add(entity); //ApplicationDbContext Categorties
        }

        public T Get(int id)
        {
            //throw new NotImplementedException();
            return dbSet.Find(id);
        }

        public IEnumerable<T> GetAll(Expression<Func<T, bool>> filter = null, Func<IQueryable<T>, IOrderedQueryable<T>> OrderBy = null, string includeProperties = null)
        {
            //throw new NotImplementedException();
            IQueryable<T> query = dbSet;

            if(filter != null)
            {
                query = query.Where(filter);
            }
            if (includeProperties != null)
            {
                foreach(var includeProp in
                    includeProperties.Split(new char[] { ',' },
                    StringSplitOptions.RemoveEmptyEntries))
                {
                    query = query.Include(includeProp);
                }
            }
            if (OrderBy != null)
            {
                return OrderBy(query).ToList();
            }
            return query.ToList();
        }

        public T GetFirstOrDefault(Expression<Func<T, bool>> filter = null,
            string includeProperties = null)
        {
            //throw new NotImplementedException();
            IQueryable<T> query = dbSet;

            if (filter != null)
            {
                query = query.Where(filter);
            }
            if (includeProperties != null)
            {
                foreach (var includeProp in
                    includeProperties.Split(new char[] { ',' },
                    StringSplitOptions.RemoveEmptyEntries))
                {
                    query = query.Include(includeProp);
                }
            }

            return query.FirstOrDefault();
        }

        public void Remove(int id)
        {
            // new NotImplementedException();
            T entity = dbSet.Find(id);
            Remove(entity);
        }

        public void Remove(T entity)
        {
            //throw new NotImplementedException();
            dbSet.Remove(entity);
        }

        public void RemoveRange(IEnumerable<T> entity)
        {
            //throw new NotImplementedException();
            dbSet.RemoveRange(entity);
        }

        T IRepository<T>.GetFirstOrDefault(Expression<Func<T, bool>> filter, string includeProperties)
        {
            throw new NotImplementedException();
        }
    }
}
