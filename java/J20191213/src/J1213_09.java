
public class J1213_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=0;
		for (i=1 ; i<=9 ; i++) {
			for (j=1 ; j<=9 ;j++) {
				//System.out.printf( i + "x" +  j + "="  +  "%2d, " ,i * j);
				    if  ((i*j)<10) {
				    	System.out.print(i + "*" + j + "=0" + i*j + "\t");
				    }
				    else {
				    	System.out.print(i + "*" + j + "=" + i*j + "\t");
				    }
			}
			System.out.println();
		}
	}

}
/*
 外迴圈                                    內迴圈
             i         i<=9       i++             j        j<=9         J++       結果
             1           V                             1           V              2          1 * 1 =1
                                                                                         3          1 * 2 =2
                                                                                         ...              ....
                                                           9                            9
            2            V           2                1          V               2          2 *1 =2            
 */
/*
巢狀迴圈
for(...... ) {
	for(......) {
		for(......) {
			........
		}
	}
}

 中斷迴圈
 break         直接中斷並離開迴圈
 
 continue   中斷迴圈並回到迴圈開頭
 					 繼續執行

*/
