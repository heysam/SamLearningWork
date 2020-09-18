import java.util.Scanner;

//自訂函式
/*
 * public     static    void        main(string[]  args)
[封裝層級] static 回傳型態 函數名(型態1 參數1,.....) {
	程式敘述;
	return 傳回值;(若無傳回值則省略 回傳型態 設為void)
}
*/
public class J0108_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k;
		double Ans;
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("計算3.5的k次方?請輸入k=");
		k = Integer.parseInt(keyboardInput.nextLine());
		Ans = power(3.5, k);                                                                    //呼叫power函式，帶入3.5 和K
		System.out.println("3.5的" + k + "次方=" + Ans);
	}

	//建立一個pow函式
	public static double power(double X, int n) {                        // 3.5帶入X，k帶入n        
		int i;
		double powerXn = 1;
		for (i = 1; i <= n; i++) {
			powerXn = powerXn * X;
		}
		return powerXn;                                         //傳回到當初哪裡呼叫的Ans
	}
}
/*
poertX    =     powerXn     *           X
                              1               *         3.5    
     3.5
                             3.5            *         3.5
3.5*3.5
                         (3.5*3.5)      *          3.5
3.5*3.5*3.5
*/

//函式的呼叫 
/*
 	函式名稱(參數........ )              無傳回值
 	變數=函式名稱(參數.........)           有傳回值
*/
