import java.util.Scanner;

public class J1206_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scn = new Scanner(System.in);    //建立輸入物件 scn 
			System.out.print("請輸入第一個整數:");
			int num1 = scn.nextInt();								//nexLine() 取得鍵盤輸入的資料(包含空白)
																							//next()       取得鍵盤輸入的資料(不包含空白)
												
			//nexInt     取得鍵盤輸入的資料(整數數值)
			//以輸入物件，取得整數數值，設定給整數變數num1
			
			System.out.print("請輸入第二個整數:");
			int num2 = scn.nextInt();
			System.out.printf("%d > %d = %b%n" , num1, num2 , num1 > num2);
																			//printf=====>f=format
																			//printf("格式字串1,格式字串2",變數1,變數2..........)
																			//%c(格式化字元)、%d(格式化整數)、%f(格式化浮點數)
																			//%s(格式化字串)、%b(格式化不林值)、%n(換行)
			System.out.printf("%d 小於         %d 為 %b  %n" , num1,num2,num1 < num2);
			System.out.printf("%d 不等於     %d 為 %b  %n" , num1,num2,num1 != num2);
			System.out.printf("%d 大於等於 %d 為 %b  %n" , num1,num2,num1 >= num2);
			System.out.printf("%d 小於等於 %d 為 %b  %n" , num1,num2,num1 <= num2);
			System.out.printf("%d      加        %d 為 %s  %n" , num1,num2,num1 + num2);
			System.out.printf("%d      減        %d 為 %s  %n" , num1,num2,num1 - num2);
			System.out.printf("%d      乘        %d 為 %s  %n" , num1,num2,num1 * num2);
			System.out.printf("%d      除        %d 為 %s  %n" , num1,num2,num1 / num2);
			scn.close();                              //close() 結束輸入，關閉輸入物件
	}
}	

/*
自動型別轉換
自動型別轉換
必須為數值資料，其他型別不會轉換
小範圍轉大範圍(整數轉浮點)(浮點不會轉換為整數)

運算式中包含多個資料型別，其轉換規則：
boolean 不轉換
char 型態轉換為 short 
若同時有short 及 int 型態全部轉int
若同時有float  及 int 型態全部轉float
記憶空間小轉大

浮點資料一般可再數值後方加上3.5f 4.8d
以宣告其為float double

*/

