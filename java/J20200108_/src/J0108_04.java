/*
�G���}�C(�h���}�C)
��ƫ��A �}�C�W��[][]
��ƫ��A �}�C�W��[][]=new ��ƫ��A[�Ĥ@���Ӽ�][�ĤG���Ӽ�]
int ar1[][]=new int[2][3];
ar1[0][0]
ar1[0][1]
ar1[0][2]
ar1[1][0]
ar1[1][1]
ar1[1][2]
*/
public class J0108_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m[][] = new int[9][9];
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				m[i-1][j-1] = i * j;  //�}�C���ޭȱq0�}�l
			}
		}
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if ((i * j) < 10) {
					System.out.print(i + "*" + j + "=0" + i * j + "\t");
				} else {
					System.out.print(i + "*" + j + "=" + i * j + "\t");
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
