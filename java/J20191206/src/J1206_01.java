import java.util.Scanner;

public class J1206_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scn = new Scanner(System.in);    //�إ߿�J���� scn 
			System.out.print("�п�J�Ĥ@�Ӿ��:");
			int num1 = scn.nextInt();								//nexLine() ���o��L��J�����(�]�t�ť�)
																							//next()       ���o��L��J�����(���]�t�ť�)
												
			//nexInt     ���o��L��J�����(��Ƽƭ�)
			//�H��J����A���o��ƼƭȡA�]�w������ܼ�num1
			
			System.out.print("�п�J�ĤG�Ӿ��:");
			int num2 = scn.nextInt();
			System.out.printf("%d > %d = %b%n" , num1, num2 , num1 > num2);
																			//printf=====>f=format
																			//printf("�榡�r��1,�榡�r��2",�ܼ�1,�ܼ�2..........)
																			//%c(�榡�Ʀr��)�B%d(�榡�ƾ��)�B%f(�榡�ƯB�I��)
																			//%s(�榡�Ʀr��)�B%b(�榡�Ƥ��L��)�B%n(����)
			System.out.printf("%d �p��         %d �� %b  %n" , num1,num2,num1 < num2);
			System.out.printf("%d ������     %d �� %b  %n" , num1,num2,num1 != num2);
			System.out.printf("%d �j�󵥩� %d �� %b  %n" , num1,num2,num1 >= num2);
			System.out.printf("%d �p�󵥩� %d �� %b  %n" , num1,num2,num1 <= num2);
			System.out.printf("%d      �[        %d �� %s  %n" , num1,num2,num1 + num2);
			System.out.printf("%d      ��        %d �� %s  %n" , num1,num2,num1 - num2);
			System.out.printf("%d      ��        %d �� %s  %n" , num1,num2,num1 * num2);
			System.out.printf("%d      ��        %d �� %s  %n" , num1,num2,num1 / num2);
			scn.close();                              //close() ������J�A������J����
	}
}	

/*
�۰ʫ��O�ഫ
�۰ʫ��O�ഫ
�������ƭȸ�ơA��L���O���|�ഫ
�p�d����j�d��(�����B�I)(�B�I���|�ഫ�����)

�B�⦡���]�t�h�Ӹ�ƫ��O�A���ഫ�W�h�G
boolean ���ഫ
char ���A�ഫ�� short 
�Y�P�ɦ�short �� int ���A������int
�Y�P�ɦ�float  �� int ���A������float
�O�ЪŶ��p��j

�B�I��Ƥ@��i�A�ƭȫ��[�W3.5f 4.8d
�H�ŧi�䬰float double

*/

