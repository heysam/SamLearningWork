import java.util.Scanner;
public class J1206_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardInput = new Scanner(System .in);    
			//�إߤ@��Scanner�A���ݨ�System.in�A���ɥi�H�ϥ�Scanner�����U�ؤ�k��Ū����J
		String str1;                             //�إߦr�ꪫ��str1
		double x;

		System.out.print("���Dx��3����,�п�Jx:");
		str1 = keyboardInput.nextLine();             //��L ��J����Ƹg�L nextLine��kŪ���ᬰ�r��
			x   = Double.parseDouble(str1);           //Double���O��parseDouble��k�A�ó]�w��X�ܼ�
		System.out.println("x��3���謰:" + (x*x*x));
		
	}

}
