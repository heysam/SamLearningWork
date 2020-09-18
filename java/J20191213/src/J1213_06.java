import java.util.Scanner;
public class J1213_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4+9+13+18+....+85+90+94+99
		Scanner keyboardInput = new Scanner(System.in);
		int sum=0;
		for (int i=4  ;  i<=94  ;  i+=9) {
			sum +=i;
		}
		System.out.println("4+13+....+22+85+94 = " + sum );

		for (int i=9  ;  i<=99  ;  i+=9) {
			sum +=i;
		}
		System.out.println("4+9+13+18+....+85+90+94+99 = " +  sum );
	}

}
/*
	起始值      條件            更新值
	 i				i<=94		i+=9		     結果sum =  i  +  (i+5)
	4				V					V				  13=    4+ (   4 + 5) 
	13           V                 V                31= 13+ ( 13+ 5)
	31           V                 V                67= 31+ ( 31+ 5)
										
*/			