
public class J1213_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=0;
		for(i=1 ; i <=7 ;  i++) {
				for(j =1 ; j<=i ; j++) {
					System.out.printf("*");				
				}
			System.out.println();     // 等於System.out.print("\n");
		}
	}
}
/*
 外迴圈(控制行數 )                    內迴圈(印星號)   
   	i       i<=7        i++                 j=1              j<=i             j++       結果
1	1       V                                      1                     V                            *        
													  2                   x                   2
2 2                           2                   1             
3	                         
 */
