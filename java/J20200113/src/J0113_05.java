//���j���(recursive)
/*	
�O���ƦC
	���@�L�a�ƦC�A�䤤���@�ƭ�
	�����e�G�ƭȤ��`�M
*/
public class J0113_05 {

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
		if ((n == 1) || (n == 0)) {
			return n;
		} else {
			return Fib(n - 1) + Fib(n - 2);
		}
	}
}

//[0 1] [1 2] [2 3]