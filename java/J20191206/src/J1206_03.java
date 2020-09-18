import java.util.Scanner;
public class J1206_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardInput = new Scanner(System .in);    
			//建立一個Scanner，附屬到System.in，此時可以使用Scanner類的各種方法來讀取輸入
		String str1;                             //建立字串物件str1
		double x;

		System.out.print("欲求x的3次方,請輸入x:");
		str1 = keyboardInput.nextLine();             //鍵盤 輸入的資料經過 nextLine方法讀取後為字串
			x   = Double.parseDouble(str1);           //Double類別的parseDouble方法，並設定給X變數
		System.out.println("x的3次方為:" + (x*x*x));
		
	}

}
