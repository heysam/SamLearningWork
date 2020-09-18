import java.util.Scanner;
public class J1213_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardInput = new Scanner(System.in);
		int sum=0 , n;
		System.out.print("½Ð¿é¤JN­È:");
		n = Integer.parseInt(keyboardInput.nextLine());
		for(int i=1 ; i<=n ; i=i+2)
			sum = sum +i;
		if((n%2)==1)
			System.out.println("1+3+....+N" + sum);
		else
			System.out.println("1+3+....+N-1 = " + sum);
	}

}
