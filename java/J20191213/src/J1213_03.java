import java.util.Scanner;
public class J1213_03 {
		//JDK7�H�eSWITCH�S���P�_�r��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardInput = new Scanner(System.in);   			//Java�i�Ӫ��O�r��A�����૬�A
		//�Q�ο�J����keyboardinput���o�r��
		System.out.print("�п�JJAVA����ex:�u���B�ҵ�~�B��:");
		switch (keyboardInput.nextLine()) {
					//�N���o���ƤJ�r��A�P�u�������
			case "�u��":  
				System.out.println("JAVA���Z���Ĭ�A");
				break;
			case "�ҵ�":
				System.out.println("JAVA���Z���Ĭ�B");
				break;
			case "�A��":
				System.out.println("JAVA���Z���Ĭ�C");
				break;
			case "����":
				System.out.println("JAVA���Z���Ĭ�D");
				break;
			case "�B��":
				System.out.println("JAVA���Z���Ĭ�E");
				break;
			default:
				System.out.println("�z��J�F���~������");
				break;				
		}
	}

}
/*
�_������
if (����1){
	�ԭz1;
		if(����2){
			if(����3){
				...
				...
			}		
		}
	}

*/