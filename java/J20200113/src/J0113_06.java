//���j���(recursive)
/*	
�O���ƦC
	���@�L�a�ƦC�A�䤤���@�ƭ�
	�����e�G�ƭȤ��`�M
*/
public class J0113_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�O���ƦC�p�U:");
		for (int i = 0; i <= 25; i++) {
			if (i % 8 == 0) {
				System.out.println();
			}
			System.out.print(Fib(i) + "\t");
		}
		System.out.println(".................");
	}

	public static int Fib(int n) {
		int n1    = 0, 
			  n2 	   = 0,
			  sum = 1;
		if ((n == 1) || (n == 0)) {
			return n;
		} else {
			for (int i = 2; i <= n; i++) {
				n1 = sum;
				sum = sum + n2;
				n2 = n1;
			}
			return sum;
		}
	}
}
//���j�禡(recursive)
/*
 "���j�禡"�P"�j��"���ۦP�����淧��
 ���j�禡����ɡA���N�e����������ƥ[�J�A
 �Φ���ư��|(�O����Ŷ�)
 ���j����I�s�A�Ǧ^�ȻP�����v�A���а���
 �i�N���j�令�j��
 */
