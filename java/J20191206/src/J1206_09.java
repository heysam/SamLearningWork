import java.util.Scanner;
public class J1206_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboardInput = new Scanner(System.in);
		int OnePrice = 200 , Qty;
		double TotalPrice;
		
		System.out.println("�C�i�J�������欰" + OnePrice + "��");
		System.out.print("�аݱz�n�ʶR���i��:");
		Qty = Integer.parseInt(keyboardInput.nextLine());
		System.out.println("========================");
		TotalPrice = OnePrice * Qty;
		if (Qty >=10) {
			TotalPrice = TotalPrice * 0.9;
			System.out.println("�ʶR�Q�i�H�W���E��");
		}else {
			TotalPrice = OnePrice * Qty;
			System.out.println("�z���ʶR10�i�H�W���J����A���L�k����");
			int more = 10-Qty;
			System.out.println("�A�ʶR" + more +"�i�J����Υi����~");
 			
		}
		System.out.println("�ʶR�i��" + Qty +"�i");
		System.out.println("�`����" + TotalPrice +"��");
	}
}

/*
if(����) {
	�ԭz��1;
}else {
	�ԭz��2;
}
*/