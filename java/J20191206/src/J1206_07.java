/*
 �y�{����
����
	if(����) {
		�ԭz��;
	}
	�Y���󦨥߫h����ԭz��
	���󪺵��G�@�w�n�����L��Boolean
	�Y�ԭz���u���@��h�i�H�ٲ�{    }(�j�A��)
*/
	import java.util.Scanner;
public class J1206_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardInput = new Scanner(System.in);
		int x;
		String str1 = new String("�z��J���O����Ʃ�0");  //�ŧi�r�ꪫ��A�ë��w�r�ꪫ�󪺤��e
		
		System.out.print("�п�J�@�ӥ����:");
		x = Integer.parseInt(keyboardInput.nextLine());   //��J���O�r���নINT
		if (x < 0) {
				str1 = "�z��J���O�t��";
		}
		System.out.println(str1);
		
	}

}
