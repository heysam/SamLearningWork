import java.util.Scanner;
public class J1213_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardInput = new Scanner(System.in);
		int Score;
		System.out.print("�п�JJAVA���Z:");
		Score = Integer.parseInt(keyboardInput.nextLine());
		if ((Score >= 0) && Score<=100) {   //�]�w���Ʊ���0~100
			 //Score���H10 ��@����B�⦡ ex:85 �� ���H10�o��O8 ���O8.5�]���ڭ̫ŧiScore��int
			switch (Score / 10 ) {   
				case 10:
					System.out.println("��������");
					break;
				case 9:
					System.out.println("���Ƶ��Ŭ��u��");
					break;
				case 8:
					System.out.println("���Ƶ��Ŭ��ҵ���");
					break;
				case 7:
					System.out.println("���Ƶ��Ŭ��A��");
					break;
				case 6:
					System.out.println("���Ƶ��Ŭ�����");
					break;
				default:
					System.out.println("���Ƶ��Ŭ��B��");
					break;
			}
		}else {
			System.out.println("�z��J�F���X�k������");
		}
		
	}

}

/*
switch~case:
switch(��� �B�⦡) {      //���   �O�_�k�X���case1�Bcase2
case ��Ʊ����1;
	�ԭz1;
	break;                          	//	���������åB���}
	
case ��Ʊ����n;
	�ԭzn;
	break;
default                        //�Ҧ������k�X�h����
	�ԭzn+1;
	break;
}
*/