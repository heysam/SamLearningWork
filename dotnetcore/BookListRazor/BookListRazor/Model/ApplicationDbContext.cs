using System;
using Microsoft.EntityFrameworkCore;
//DbContext實例表示與數據庫的會話，可用於查詢和保存實體的實例。 DbContext是工作單元和存儲庫模式的組合。
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
//DbSet<TEntity> 可用於查詢和保存Book實例。 針對DbSet <TEntity>的LINQ查詢將轉換為針對數據庫的查詢。
//針對DbSet <TEntity>的LINQ查詢的結果將包含從數據庫返回的結果，並且可能不會反映在上下文中進行的尚未持久化到數據庫的更改。
//例如，結果將不包含新添加的實體，並且可能仍包含標記為刪除的實體。
//根據所使用的數據庫，可以在內存中評估針對DbSet <TEntity>的LINQ查詢的某些部分，而不是將其轉換為數據庫查詢。
//通常從派生的DbContext上的DbSet <TEntity>屬性或DbContext.Set <TEntity>（）方法獲得DbSet <TEntity>對象。
