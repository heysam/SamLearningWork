import java.util.Scanner;

/*
�}�C
�ۦP����ƫ��A���ܼơA�x�s�h�ӭȡA
�H�@���ܼƦW�١A���P�����ޭ��x�s��
�ϥ�:
1.�ŧi�Q��ƫ��A  �}�C�W��[]   //�}�C�W�٤S���ܼƦW�� 
			    ��ƫ��A [] �}�C�W��
2.�إ߰}�C����Q �}�C�W�� = new ��ƫ��A[ ]
								  (���}�C�t�m�O����)
								  (��ƫ��A[]�̭��i�[�J�����Ӽƪ��ƭ�(�i�ٲ�))
								  ���w���}�C
3.�x�s(�]�w)�}�C�����Q 
		�}�C�W��[���ޭ�]=��	;
	��ƫ��A �}�C�W��[] = new ��ƫ��A[]{
			����1,����2,..................
	}
	
	��ƫ��A ���C�W��
	
	��ƫ��A �}�C�W��[];
	�}�C�W�� = new ��ƫ��A[�����Ӽ�];      //�t�m�O����
												(�����Ӽ�:�T����t�O����Ŷ��A���ٲ�)
	��ƫ��A �}�C�W��[]= new ��ƫ��A[�����Ӽ�];
  */

/*
 public class J0108_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 int students[];
		students = new students[];
		��ƫ��A[] �}�C�W�� =  new �}�C���A[]
		��ƫ��A �}�C�W��[] =  new �}�C���O[]

		int  students[] = new students[];
		students[0]=90;
		students[1]=80;
		students[2]=70;
	}

}
 */
public class J0108_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		double average;
		Scanner keyboardInput = new Scanner(System.in);
		int trades[] = new int[4];
		for (int i = 0; i < trades.length; i++) {
										//�}�C�W��.length(���C���פ����ӯ�)
			System.out.print("��" + (i + 1) + "�u����~�B: ");
			trades[i] = Integer.parseInt(keyboardInput.nextLine());
			sum = sum + trades[i];
		}
		average = (double) sum / (double) 12;
		System.out.println("=============");
		System.out.println("       �~����~�B:" + sum);
		System.out.println("�����Ӥ���~�B:" + average);
	}
}
