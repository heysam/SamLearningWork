import java.util.Scanner;
//Scanner隸屬為java.jtul近來，所以必須事先import
public class J1203_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbin = new Scanner(System.in);  /*kbin=>建立一個經由鍵盤輸入的Scanner 物件 名稱為kbin
																						    System.in=>鍵盤輸入*/
		String str1,str2;													//建立兩個字串物件str1,str2
		
		System.out.print("請輸入第一個字串");
			str1 = kbin.nextLine();                                    /*nextLine()讀取鍵盤輸入的資料(包含空白)
																						  	  next()       讀取鍵盤輸入的資料(布包含空白)
																						      以kbin物件執行nextline取得鍵盼輸入的資料的資料,
																						      給str1字串物件*/
		System.out.print("請輸入第二個字串:");
		str2 = kbin.nextLine();
		System.out.println("您所輸入的字串如下:");
		System.out.println(str1);
		System.out.println(str2);
		System.out.print(str1);
		System.out.print(str2);
		
		
	}

}
