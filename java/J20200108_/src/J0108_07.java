//�üƨ禡:random()
/*
�ݩ�Math���O
�榡:random()  //�S���Ѽ�
�^��0~1(���t1)���H���ƭ�
*/

import java.util.Scanner;
public class J0108_07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum = 0;
		char addChoice;
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.print("1+2+3+.....+n=?�п�Jn=");
		n = Integer.parseInt(keyboardInput.nextLine());
		
		System.out.print("�аݭn����ƩM(O),���ƩM(E),�٬O��ƩM(I)?");
		System.out.print("�п��:");
		addChoice = keyboardInput.nextLine().charAt(0); 
		//���o��J�r��Ĥ@�Ӧr���]�w��addChoice
		//charAt��k
		/*Java�r�����O�U����k
			���o�r��S�w��m���r��
			�榡:charAt(�r����m�s��)   �r�ꪫ��.charAt(n)
			�r��إ߫�A�r���Q�ᤩ��m�A�s���q0�}�l�p��
			EX:   JavaScript => charAt(5)=>c
		*/
		switch (addChoice) {
				case 'O': {
					sum = odd(n);                     //�I�sodd�禡
					break;
				}
				case 'E': {
					sum = even(n);                  //�I�seven�禡
					break;
				}
				case 'I': {
					sum = totalSum(n);         //�I�stotalSum�禡
					break;
				}
				default:
					System.out.println("��ܿ��~");
		}
		System.out.println("�`�M��" + sum);
	}

	public static int odd(int U) {                          // odd���
		int i, total = 0;
		for (i = 1; i <= U; i++) {
			if (i % 2 == 1) {                                          //���H2���l�ƬO1�O�_��
				total = total + i;
			}
		}
		return total;
	}

	public static int even(int U) {                    // even���
		int i, total = 0;
		for (i = 1; i <= U; i++) {
			if (i % 2 == 0) {                                      //���H2���l�ƬO0�O����
				total = total + i;
			}
		}
		return total;
	}

	public static int totalSum(int U) {             // totalSum���
		return odd(U) + even(U);                      //�I�s�_�ƩM���ƨ�Ƭۥ[
	}
}
