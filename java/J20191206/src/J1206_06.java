
public class J1206_06 {
	/*
	�r����ƭ�  �ϥΤ������O����k(Double,parseDouble)
	�ƭ���r�� 1.string ���O����valueOf() ��k
						  2.�U���O���Oto String()��k
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short a = 100;
		int b = 200;
		float d = 3.5f;
		double e = 4.8d;
		String s1 , s2;
						
		s1 = String.valueOf(a+b) +         //�r�� a�Oshort=100 ,  b�Oint=200
					   String.valueOf(a) +        //100
					   String.valueOf(b);          // 200
		s2 = Float.toString(d) +             //�r�� d�Ofloat=3.5
				 Double.toString(e);           // e�Odouble=4.8
		System.out.println("s1 = " + s1);      //s1 = 300100200
		System.out.println("s2 = " + s2);      //s2 = 3.54.8
	}
}
/*
valueOf()���h��(�и�)(overload)��k�A�i�������󫬧O�����
�U���O���O��to String()�����H�U���O���O��Ƭ��D
*/	



