
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
 �~�j��                                    ���j��
             i         i<=9       i++             j        j<=9         J++       ���G
             1           V                             1           V              2          1 * 1 =1
                                                                                         3          1 * 2 =2
                                                                                         ...              ....
                                                           9                            9
            2            V           2                1          V               2          2 *1 =2            
 */
/*
�_���j��
for(...... ) {
	for(......) {
		for(......) {
			........
		}
	}
}

 ���_�j��
 break         �������_�����}�j��
 
 continue   ���_�j��æ^��j��}�Y
 					 �~�����

*/
