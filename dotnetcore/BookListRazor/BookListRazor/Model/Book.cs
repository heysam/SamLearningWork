using System;
using System.ComponentModel.DataAnnotations;
//加入套件
//EntityFrameworkCore
//SqlServer
//EntityFrameworkCore.Tools
namespace BookListRazor.Model
{
    public class Book
    {
        [Key]//表示唯一標識實體的一個或多個屬性。
        public int Id { get; set; }

        [Required]//指定需要一個數據字段值。
        public string Name { get; set; }
        public string Author { get; set; }
        public string ISBN { get; set; }
    }
}
