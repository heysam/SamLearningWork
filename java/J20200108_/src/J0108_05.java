//函式(Function)
/*
函式即為方法
屬於一個類別具有一個特定功能
以呼叫方式執行
內建函式:
1. 函式名稱(參數)
	類別名稱.函式名(參數)
*/
public class J0108_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i = 7.0, j = 4.0;
		double powNum, logNum;

		powNum = Math.pow(i, j);    //math數學類別 ，提供數學方法
															  //Math.方法(參數)
		System.out.println(i + "的" + j + "次方=" + powNum);
		logNum = Math.log10(powNum);
		System.out.println(powNum + "取10的對數=" + logNum);
	}
//pow(a,b):求a平方b
//log10(a): 求a的對數
}
