//return ���@��
/*
		1.�^�Ǩ禡����� return �^�ǭ�
				
		2.�禡����^    (�^����I�s�禡���a��)    return;
�@�Ө禡����return�����w�@��
*/
public class J0108_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k;
		k = func1();
		System.out.println("k=" + k);
	}

	public static int func1() {
		int a = 5, b = 7;
		
		a++;                           //a=6
		if (a > 0) {
			return a + b;
		}
		
		a++;                          //a=6
		if (a > 0) {
			return a + b;
		}
		
		a++;                         //a=6
		return a + b;
	}
}
//�@�ӧt���i�H���h��return 
//�u�|�^�ǻ��@��return���槹�N���|�A����F

//�S���Ǧ^�ȴN�|�^����I�s�t�����a��
//����return�N���|�A����t������{��