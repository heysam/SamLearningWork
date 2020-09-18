
public class plusplus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5, y=10, i=5, j=10 ;
		int a=1,b=1,c=1,d=1;
		
		
		System.out.println("i++="+ i++ );
	
				a=1+ i++;
				b=1 + j-- ;
				c=1+ ++x;
				d=1 + --y;
				
		System.out.println("a=1 + i++ 結果a="+a);
		System.out.println("b=1 + j--   結果b="+b);
		System.out.println("c=1 + ++x 結果c="+c);
		System.out.println("d=1 + --y 結果d="+d);
	}
}
