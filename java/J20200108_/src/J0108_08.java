//return 的作用
/*
		1.回傳函式的資料 return 回傳值
				
		2.函式的返回    (回到當初呼叫函式的地方)    return;
一個函式中之return不限定一個
*/
public class J0108_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k;
		k = func1();
		System.out.println("k=" + k);
	}

	public static int func1() {
		int a = 5, b = 7;
		
		a++;                           //a=6
		if (a > 0) {
			return a + b;
		}
		
		a++;                          //a=6
		if (a > 0) {
			return a + b;
		}
		
		a++;                         //a=6
		return a + b;
	}
}
//一個含式可以有多個return 
//只會回傳遞一個return執行完就不會再執行了

//沒有傳回值就會回到當初呼叫含式的地方
//執行return就不會再執行含式後續程式