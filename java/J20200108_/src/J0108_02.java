import java.util.Scanner;

//foreach: �t�@�ذj���O�A�q���ΨӨ��Nfor�j��
//				 ���Ω󭫽Ʃʤ���(�p�}�C)
//for (��ƫ��A :���Ʃʤ���) {
//	�{���ԭz;
//	.....
//}
//����ɷ|�۰ʱN�{���ԭz�a�J���Ʃʤ��������C�@�Ӥ���

public class J0108_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		double average;
		Scanner keyboardInput = new Scanner(System.in);
		int trades[] = new int[4];
		for (int element : trades) { // element���� (�i�۩w)
			System.out.print("�U�u����~�B:");
			element = Integer.parseInt(keyboardInput.nextLine()); //�u�t�dŪ�A���t�d�g
			sum = sum + element;
		}
		average = (double) sum / (double) 12;
		System.out.println("=============");
		System.out.println("       �~����~�B:" + sum);
		System.out.println("�����Ӥ���~�B:" + average);
		System.out.println("trades[0]:" + trades[0]);   //trades[0]:0  �S���g�^�h

	}
}
