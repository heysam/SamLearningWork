/*��"��"�I�s  call by value
	�H   "�Ѽ�"   �O����϶��F��
	�I�s��Y�^�Ǥ�(�Q�I�s��)������
	�ƥ������ӭ�
�ǻ���1(�Ѽ�)----------------------->�Q�I�s��2(�Ѽ�)
							�ǰѼƭȰѼ�1�Ѽ�2�ϥΤ��P��}
							�Ѽ�2�ȧ��ܡA"�ä��v�T�Ѽƭ�1��"
*/
public class J0113_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=1,n=1;
		func1(m,n);
		System.out.println("main(   )��m=" +m);
		System.out.println("main(   )��n=" +n);
	}
	public static void func1(int a ,int b) {
		a= a+10;
		b=b+100;
		System.out.println("func1(   )��a=" +a);
		System.out.println("func1(   )��b=" +b);
	}
}
