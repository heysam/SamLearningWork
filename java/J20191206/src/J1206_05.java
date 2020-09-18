import java.util.Scanner;
public class J1206_05 {
	public static void main(String[] args) {
		
		final int PASS = 60; 												//final 常數
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入兩個成績(中間用空白相隔):");   //完整的輸入完畢 才會執行
		 int score = scn.nextInt();                                       //，nextInt 只會抓數字 所以會排除空白
		System.out.printf("第一個成績為%4d," 				//顯示整數4位數score
											+ "及格分數為%4d,"			   //PASS
											+ "是否及格:%b\n",              //score >=PASS (判斷是否及格)
											score , PASS, score >= PASS);
		score = scn.nextInt();
		System.out.printf("第二個成績為%4d,"				//顯示整數4位數score
											+ "及格分數為%4d,"				 //PASS
											+ "是否及格:%b\n",				//score >=PASS (判斷是否及格)
											score, PASS , score >= PASS);		
		scn.close();
	}
}


/*
字串轉數值  使用內建類別之方法(Double,parseDouble)
數值轉字串 1.string 類別中的valueOf() 方法
個型別類別to String()方法
*/