import java.util.Scanner;
public class J1206_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboardInput = new Scanner(System.in);
		int OnePrice = 200 , Qty;
		double TotalPrice;
		
		System.out.println("每張入場卷價格為" + OnePrice + "元");
		System.out.print("請問您要購買的張數:");
		Qty = Integer.parseInt(keyboardInput.nextLine());
		System.out.println("========================");
		TotalPrice = OnePrice * Qty;
		if (Qty >=10) {
			TotalPrice = TotalPrice * 0.9;
			System.out.println("購買十張以上打九折");
		}else {
			TotalPrice = OnePrice * Qty;
			System.out.println("您未購買10張以上的入場券，恕無法打折");
			int more = 10-Qty;
			System.out.println("再購買" + more +"張入場券及可打折~");
 			
		}
		System.out.println("購買張數" + Qty +"張");
		System.out.println("總價為" + TotalPrice +"元");
	}
}

/*
if(條件) {
	敘述式1;
}else {
	敘述式2;
}
*/