//�禡(Function)
/*
�禡�Y����k
�ݩ�@�����O�㦳�@�ӯS�w�\��
�H�I�s�覡����
���ب禡:
1. �禡�W��(�Ѽ�)
	���O�W��.�禡�W(�Ѽ�)
*/
public class J0108_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i = 7.0, j = 4.0;
		double powNum, logNum;

		powNum = Math.pow(i, j);    //math�ƾ����O �A���ѼƾǤ�k
															  //Math.��k(�Ѽ�)
		System.out.println(i + "��" + j + "����=" + powNum);
		logNum = Math.log10(powNum);
		System.out.println(powNum + "��10�����=" + logNum);
	}
//pow(a,b):�Da����b
//log10(a): �Da�����
}
