import java.util.Scanner;
//Scanner���ݬ�java.jtul��ӡA�ҥH�����ƥ�import
public class J1203_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbin = new Scanner(System.in);  /*kbin=>�إߤ@�Ӹg����L��J��Scanner ���� �W�٬�kbin
																						    System.in=>��L��J*/
		String str1,str2;													//�إߨ�Ӧr�ꪫ��str1,str2
		
		System.out.print("�п�J�Ĥ@�Ӧr��");
			str1 = kbin.nextLine();                                    /*nextLine()Ū����L��J�����(�]�t�ť�)
																						  	  next()       Ū����L��J�����(���]�t�ť�)
																						      �Hkbin�������nextline���o��߿�J����ƪ����,
																						      ��str1�r�ꪫ��*/
		System.out.print("�п�J�ĤG�Ӧr��:");
		str2 = kbin.nextLine();
		System.out.println("�z�ҿ�J���r��p�U:");
		System.out.println(str1);
		System.out.println(str2);
		System.out.print(str1);
		System.out.print(str2);
		
		
	}

}
