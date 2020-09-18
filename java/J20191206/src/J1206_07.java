/*
 流程控制
條件式
	if(條件) {
		敘述式;
	}
	若條件成立則執行敘述式
	條件的結果一定要式布林值Boolean
	若敘述式只有一行則可以省略{    }(大括號)
*/
	import java.util.Scanner;
public class J1206_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardInput = new Scanner(System.in);
		int x;
		String str1 = new String("您輸入的是正整數或0");  //宣告字串物件，並指定字串物件的內容
		
		System.out.print("請輸入一個正整數:");
		x = Integer.parseInt(keyboardInput.nextLine());   //輸入的是字串轉成INT
		if (x < 0) {
				str1 = "您輸入的是負數";
		}
		System.out.println(str1);
		
	}

}
