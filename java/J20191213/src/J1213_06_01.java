import java.util.Scanner;
public class J1213_06_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4+9+13+18+....+85+90+94+99
		Scanner keyboardInput = new Scanner(System.in);
		int sum=0;
		for (int i=4  ;  i<=94  ;  i+=9) {
			sum = sum + i  +  (i+5);
		}
		System.out.println("4+9+13+18+....+85+90+94+99 = " +  sum );
	}

}
/*
4  +   9        ®t5
9        9        ®t9
13+18        ®t5

85+90         ®t5
  9      9         ®t9
94+99         ®t5
*/