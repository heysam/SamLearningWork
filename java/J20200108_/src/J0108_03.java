import org.graalvm.compiler.lir.LIRInstruction.Temp;

//��w�ƧǪk
/*
a1,a2,a3,a4,a5 �Ƨ�
a1�Ma2��A�Ya1>a2,�h�Na1,a2������
a1�Ma3��A�Ya1>a3.....
ex:
3,65,18,27,11 �Ƨ�
�Ĥ@����
  3<65  ������   3 65
65>18  ����       3 18 65
65>27  ����       3 18 27 65
65>11  ����       3 18 27 11 65
�ĤG����........
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
				 Temp (�Ȧs�ܼ�)
					/ �T�Ӵ`��   \
	  	 x[i+1]   ___________   x[i]			
*/
				}
			}
			k = times;
		}
		for (int num : x) {
			System.out.print(num + "\t");
		}
		System.out.println("\n�S�O��\t" + spec);

	}

}
