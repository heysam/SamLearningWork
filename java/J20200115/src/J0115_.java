//物件導向
/*
 屬性:物件的特性或性質
  	具有屬性值 藉由屬性值改變物件的性質
  	亦稱為成員變數(類別成員)

方法:物件的行為動作
  		及程式的函式
  		亦稱為成員函式成員方法
  		
  		類別是同類型物件集合
  		
封裝:規範類別的使用狀態
	將類別內的物件設定為內部或外部使用
	等級區分:
		public			  : 公用  任何程式均可存取
		private			  : 私用  只允許同類別內存取
		protected		  : 保護  與允許同類別及衍生類別存取
		ex:	食品工廠→廠房 具有封裝性
				(屬性)對外:成員、原料可存取(public)
				(屬性)對內:水(pivate)
				(方法)對外:使用水 製作食品(public)
				(方法):對內:機器起動
		ex鬧鐘物件 公用屬性、方法
							   私有屬性、方法
							   
繼承::將程式碼重複使用

多型:方法相同，但有細部執行的不同

Java完全支援兩特性
--------------------------------------------------------------------

Java的類別宣告
[封裝][修飾子] class 類別名稱{
	類別內容 (成員)
	成員變數 (屬性)
	成員方法 (函式)
}
class 主類別必須為public
被宣告為public之類別可被import

宣告類別物件
			類別名稱 物件名稱
	產生物件實體
			物件名稱 = new 類別名稱(參數.............)
	兩式合一:
				類別名稱 物件名稱 = new 類別名稱(參數..............)
	類別屬性及發法的存取
				物件名稱.屬性名稱;
				物件名稱.方法(參數..........)
 */



//了解類別的建立、物件的操作
public class J0115_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCar bus = new CCar();              //建立Ccar類別的物件
		CCar truck = new CCar();          //建立Ccar類別的物件
		CCar taxi = new CCar();             //建立Ccar類別的物件
															    //變數等於物件的屬性
		bus.name = "消防車";               //物件存取屬性
		bus.wheel = 6;
		bus.person = 40;

		truck.name = "卡車";
		truck.wheel = 8;
		truck.person = 3;

		taxi.name = "轎車";
		taxi.wheel = 4;
		taxi.person = 5;
		 //taxi.engine = "V16";                          //不可存取私有等級的屬性
		 
		System.out.print(bus.name + "有" + bus.wheel + "個輪子");
		System.out.println(",可載" + bus.person + "人");
		System.out.print(truck.name + "有" + truck.wheel + "個輪子");
		System.out.println(",可載" + truck.person + "人");
		System.out.print(taxi.name + "有" + taxi.wheel + "個輪子");
		System.out.println(",可載" + taxi.person + "人");
	}
}

class CCar {      //視為package
	public int wheel;
	public int person;
	public String name;
	private String engine;                                 //只能用在Ccar裡面，因為是private
}

/*
主類別{
	主方法(......) {
		建立其通 類別物件
		操作該物見的屬性
	}
}

其他類別{
	.........
}
*/



