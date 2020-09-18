
public class traing_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x=0 ; x<=9 ; x++) {
			for(int y=0 ; y<=9 ; y++) {
				
				if (x%2==0 && y%2==0) {
					System.out.printf("%d*%d = %d \t", y , x, x*y);
				}
			}
			System.out.println();
		}
	}

}
