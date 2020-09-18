//患癹ㄧ计(recursive)
/*	
禣Α计
	礚絘计ㄤいヴ计
	戳玡计ぇ羆㎝
*/
public class J0113_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("禣Α计:");
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