import java.util.Scanner;
public class J1206_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		//�إߤ@��Scanner�A���ݨ�System.in�A���ɥi�H�ϥ�Scanner�����U�ؤ�k��Ū����J
		System.out.print("�п�J�p�����Z:");
		int score1 = scn.nextInt();      //Ū��ӬO��ơA�ŧi�]�O���
		System.out.print("�п�JJava���Z:");
		int score2 = scn.nextInt();
		System.out.print("�п�J�q�l�Ǧ��Z:");
		int score3 =  scn.nextInt();
		System.out.printf("�������� =%6.2f \n", (float) (score1 + score2 + score3 )/3);
	}
	/*
	%6.2f�N�B�I�ƭȮ榡�Ƭ��`���6��  (�]�t�p���I)
														 �p��2��
	 */
}
