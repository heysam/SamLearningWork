/*
二為陣列(多為陣列)
資料型態 陣列名稱[][]
資料型態 陣列名稱[][]=new 資料型態[第一維個數][第二維個數]
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
				m[i-1][j-1] = i * j;  //陣列索引值從0開始
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
