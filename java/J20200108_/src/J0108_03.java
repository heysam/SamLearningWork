import org.graalvm.compiler.lir.LIRInstruction.Temp;

//氣泡排序法
/*
a1,a2,a3,a4,a5 排序
a1和a2比，若a1>a2,則將a1,a2項互換
a1和a3比，若a1>a3.....
ex:
3,65,18,27,11 排序
第一次比
  3<65  不互換   3 65
65>18  互換       3 18 65
65>27  互換       3 18 27 65
65>11  互換       3 18 27 11 65
第二次比........
*/

public class J0108_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = { 25, 10, 39, 40, 33, 12 };
		int spec = 11;
		int k, times, temp;
		k = x.length - 1;
		while (k != 0) {
			times = 0;
			for (int i = 0; i < k - 1; i++) {
				if (x[i] > x[i + 1]) {
					temp = x[i];
					x[i] = x[i + 1];
					x[i + 1] = temp;
					times = i;
/*
				 Temp (暫存變數)
					/ 三個循環   \
	  	 x[i+1]   ___________   x[i]			
*/
				}
			}
			k = times;
		}
		for (int num : x) {
			System.out.print(num + "\t");
		}
		System.out.println("\n特別號\t" + spec);

	}

}
