import java.util.Scanner;
//	if-else if:�h����
//	if(����1) {
//		�ԭz1;
//	}else if (����2) {
//		�ԭz2;
//	}else if (����n) {
//		�ԭzn;
//	}else {
//		�ԭzn+1;
//	}
//	�v�@�P�_����
//	�Y�Y�@���󦨥�
//	�h����ӱԭz��
//	�Ҧ����󳣤�����
//	�h����ԭzn+1
public class J1213_01 {
	public static void main(String[] args) {
				// TODO Auto-generated method stub
		Scanner keyboardInput = new Scanner(System.in);
		int Score;
		System.out.print("�п�JJAVA���Z:");
		Score = Integer.parseInt(keyboardInput.nextLine());
		if (Score < 60) {
			System.out.println("���Ƭ��B��");
		}else if(Score <= 69) {
			System.out.println("���Ƭ�����");
		}else if (Score <= 79) {
			System.out.println("���Ƭ��A����");
		}else if (Score <= 89) {
			System.out.println("���Ƭ��ҵ�");
		}else if (Score <= 99) {
			System.out.println("���Ƭ��u����");
		}else if (Score == 100) {
			System.out.println("��������");
		}else {
			System.out.println("�z��J�F���X�k������");
		}
	}

}
