//Class類別名必須是(test)檔案的名稱

public class test {
	//
	//main主方法 為JAVA程式執行的起點,只有一個
	//主程式必須包含一個(main)主方法
	//public封裝層級
	//static宣告為class的方法，主類別的方法
	//void 代表沒有傳回值
	//方法傳入的參數
	//String[]參數為字串陣列格式
	//args 參數的意思
	//System.out標準輸出 (螢幕 印表機) 預設式螢幕
	//println print(列印) ln(line換行)   輸出並且換行
	//print ()
	//字串必須用雙引號瓜住
	//每一行結束必須加上分號
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("這是我第一支JAVA程式");
	}
}


//變數
//在程式中隨時可以改變值
//儲存資料
//JAVA變數一定要宣告，而且宣告的時候同時設定資料型態(資料型別)
//原型資料型態，非原型資料型態
//四大類 八種
//
//整數類
//位元       byte
//短整數   short
//整數       int
//長整數   long
//
//實數類(小數)
//單精度浮點      float
//倍經度浮點數 double
//
//布林型態
//布林值 boolean
//
//字元型態
//單一文字 char
/////////////////////////////////////////////////////
//
//變數宣告
//資料型態 變數名稱;
//資料型態 變數1,變數2,....;
//資料型態 變數1=值1,變數2=值2,.......;
//
//常數
//永遠不變的值
//
//
//
//輸出
//print (輸出資料或變數)不換行
//prinln(輸出資料或變數)換行
//printf(格式字串,變數1,2,3)
//format(格式字串,變數1,2,3)
//
//格式字串
//%c   字元
//%s   字串
//%f    浮點數
//%d   十進位
//
//輸入
//
//使用Scanner
//util套件.程式開發(package)
//
//import java.util.*;
//

/*
運算
算術運算子 + , - , * , / , %(a%b取a/b之餘數)
比較運算子 > , < ,  >= ,  <= ,  == ,  !=
邏輯運算子 以布林資料作為運算元
&&(AND 且)   =>兩個運算元都為True,結果為True
||(OR或)             =>兩個運算元有一個為True,,結果為True
!(NOT否)  =>將運算元反向TRUE->False, false->true

邏輯增值表
a			b	|	a&&b			a||b			!a
_________|_______________________________
T			T	|		T						T				F
T			F	|		F						T				F
F			T	|		F						T				T
F			F	|		F						F				T

指定(複合)運算
指定 => = 
 					ex:(a=6 ,將6指定給a)
複合 =>+=  -=  x=   /=     %=
					ex:   a+=1  等於   a=a+1
					
					
遞增(減)運算子 ++ -- (前後接一個運算子)
++a  ,a++    將a加1
--a   , a--      將a減1

前置運算 a++   ,     a--
	運算元需與其他單元做運算，最後再加或減1
後至運算++a   ,     --a
    運算元需先加或減1,再與其他單元做運算

x=5       a=1+ i++;    a=6    , i=6  
y=10    b=1 + j--  ;     b=11 ,  j=9
i=5       c=1+ ++x;    c=7     ,x=6
j=10    d=1 + --y;     d=10  ,y=9

int x=5, y=10, i=5, j=10;
int a=1+ i++,
	  b=1 + j-- ,
	  c=1+ ++x,
	  d=1 + --y;

*/



