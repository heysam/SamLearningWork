import java.util.Scanner;
public class J1206_05 {
	public static void main(String[] args) {
		
		final int PASS = 60; 												//final �`��
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J��Ӧ��Z(�����Ϊťլ۹j):");   //���㪺��J���� �~�|����
		 int score = scn.nextInt();                                       //�AnextInt �u�|��Ʀr �ҥH�|�ư��ť�
		System.out.printf("�Ĥ@�Ӧ��Z��%4d," 				//��ܾ��4���score
											+ "�ή���Ƭ�%4d,"			   //PASS
											+ "�O�_�ή�:%b\n",              //score >=PASS (�P�_�O�_�ή�)
											score , PASS, score >= PASS);
		score = scn.nextInt();
		System.out.printf("�ĤG�Ӧ��Z��%4d,"				//��ܾ��4���score
											+ "�ή���Ƭ�%4d,"				 //PASS
											+ "�O�_�ή�:%b\n",				//score >=PASS (�P�_�O�_�ή�)
											score, PASS , score >= PASS);		
		scn.close();
	}
}


/*
�r����ƭ�  �ϥΤ������O����k(Double,parseDouble)
�ƭ���r�� 1.string ���O����valueOf() ��k
�ӫ��O���Oto String()��k
*/