//亂數函式:random()
/*
屬於Math類別
格式:random()  //沒有參數
回傳0~1(不含1)之隨機數值
*/

import java.util.Scanner;
public class J0108_07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum = 0;
		char addChoice;
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.print("1+2+3+.....+n=?請輸入n=");
		n = Integer.parseInt(keyboardInput.nextLine());
		
		System.out.print("請問要做基數和(O),偶數和(E),還是整數和(I)?");
		System.out.print("請選擇:");
		addChoice = keyboardInput.nextLine().charAt(0); 
		//取得輸入字串第一個字元設定為addChoice
		//charAt方法
		/*Java字串類別下的方法
			取得字串特定位置隻字元
			格式:charAt(字元位置編號)   字串物件.charAt(n)
			字串建立後，字元被賦予位置，編號從0開始計算
			EX:   JavaScript => charAt(5)=>c
		*/
		switch (addChoice) {
				case 'O': {
					sum = odd(n);                     //呼叫odd函式
					break;
				}
				case 'E': {
					sum = even(n);                  //呼叫even函式
					break;
				}
				case 'I': {
					sum = totalSum(n);         //呼叫totalSum函式
					break;
				}
				default:
					System.out.println("選擇錯誤");
		}
		System.out.println("總和為" + sum);
	}

	public static int odd(int U) {                          // odd函數
		int i, total = 0;
		for (i = 1; i <= U; i++) {
			if (i % 2 == 1) {                                          //除以2的餘數是1是奇數
				total = total + i;
			}
		}
		return total;
	}

	public static int even(int U) {                    // even函數
		int i, total = 0;
		for (i = 1; i <= U; i++) {
			if (i % 2 == 0) {                                      //除以2的餘數是0是偶數
				total = total + i;
			}
		}
		return total;
	}

	public static int totalSum(int U) {             // totalSum函數
		return odd(U) + even(U);                      //呼叫奇數和偶數函數相加
	}
}
