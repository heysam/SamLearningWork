//遞迴函數(recursive)
/*	
費式數列
	為一無窮數列，其中任一數值
	為期前二數值之總和
*/
public class J0113_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("費式數列如下:");
		for (int i = 0; i <= 25; i++) {
			if (i % 8 == 0) {
				System.out.println();
			}
			System.out.print(Fib(i) + "\t");
		}
		System.out.println(".................");
	}

	public static int Fib(int n) {
		int n1    = 0, 
			  n2 	   = 0,
			  sum = 1;
		if ((n == 1) || (n == 0)) {
			return n;
		} else {
			for (int i = 2; i <= n; i++) {
				n1 = sum;
				sum = sum + n2;
				n2 = n1;
			}
			return sum;
		}
	}
}
//遞迴函式(recursive)
/*
 "遞迴函式"與"迴圈"有相同的執行概念
 遞迴函式執行時，須將前次的相關資料加入，
 形成資料堆疊(記憶體空間)
 遞迴執行呼叫，傳回值與控制權，反覆執行
 可將遞迴改成迴圈
 */
