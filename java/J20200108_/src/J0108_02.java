import java.util.Scanner;

//foreach: 另一種迴圈格是，通盛用來取代for迴圈
//				 應用於重複性元素(如陣列)
//for (資料型態 :重複性元素) {
//	程式敘述;
//	.....
//}
//執行時會自動將程式敘述帶入重複性元素中的每一個元素

public class J0108_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		double average;
		Scanner keyboardInput = new Scanner(System.in);
		int trades[] = new int[4];
		for (int element : trades) { // element元素 (可自定)
			System.out.print("各季的營業額:");
			element = Integer.parseInt(keyboardInput.nextLine()); //只負責讀，不負責寫
			sum = sum + element;
		}
		average = (double) sum / (double) 12;
		System.out.println("=============");
		System.out.println("       年度營業額:" + sum);
		System.out.println("平均個月營業額:" + average);
		System.out.println("trades[0]:" + trades[0]);   //trades[0]:0  沒有寫回去

	}
}
