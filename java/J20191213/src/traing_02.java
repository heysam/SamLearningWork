
import java.util.Scanner;
public class traing_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int quota , pay;
			float hold;
			Scanner keyboardInput = new Scanner(System.in);   			//Java�i�Ӫ��O�r��A�����૬�A
			System.out.print("�п�J�H���B��:");
				quota = Integer.parseInt(keyboardInput.nextLine());
			System.out.print("ú�ڬO�_���`:");
				pay = Integer.parseInt(keyboardInput.nextLine());
				if ((pay !=0) || (pay !=1))
				{
					if (pay !=1) {
						System.out.print("�w�ɲ{�����B��0");
					} else {
						System.out.print("�п�J���d�~��");
						hold = Float.parseFloat(keyboardInput.nextLine());
						if (hold < 0.5)
						{
							System.out.print("�L�k�w�ɲ{��");
						}else if (hold >=0.5 &&  hold <1) {
							System.out.printf("�w�ɲ{�����B��"  +  quota * 0.2); 
						}else if (hold >=1) {
							System.out.printf("�w�ɲ{�����B��" + quota * 0.1) ;
						}
					}
				}else {
					System.out.print("�L�k�w�p�{��");
				}
				
	}
}
/*
 �H���B��
ú�ڬO�_���`
���d���p
��J����keyboardinput
�п�J�H���B�� <=keyboardinput  ���ӭn����

ú�ڬO�_���`�ܼƪ���1��0�h�P�_
�p�G�i�H�ǡA�A�~��
 */