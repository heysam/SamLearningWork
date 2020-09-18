/*傳"值"呼叫  call by value
	以   "參數"   記憶體區間達到
	呼叫方即回傳方(被呼叫端)的對應
	副本接收該值
傳遞端1(參數)----------------------->被呼叫端2(參數)
							傳參數值參數1參數2使用不同位址
							參數2值改變，"並不影響參數值1值"
*/
public class J0113_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=1,n=1;
		func1(m,n);
		System.out.println("main(   )的m=" +m);
		System.out.println("main(   )的n=" +n);
	}
	public static void func1(int a ,int b) {
		a= a+10;
		b=b+100;
		System.out.println("func1(   )的a=" +a);
		System.out.println("func1(   )的b=" +b);
	}
}
