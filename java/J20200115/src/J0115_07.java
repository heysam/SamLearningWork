/*
����r:this
���O�ۤv  ����ۤv(����)
������O�ӦӨ��A this =���O�ۤv
	���ͪ����A��󪫥�this = ���󥻨�
	����.�ݩ�
		�ۤv
		
		this.var = X.var           x�Ythis     (����Ѧ�(this))
		Java�ܲ����O��
		�|�۰ʥ[�Jthis�ܼ�
		this�ëD���O�����A�u��ϥΦb���O��    (this.���󪺥t�@�ӧO�W!?)
		
		
		this() �I�s�����O���غc�l (��b�غc�l��)
		�u���b�⪯�J���Ĥ@��
*/
public class J0115_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CMyClass5 X = new CMyClass5();
		X.show();
	}

}

class CMyClass5 {
	public int var = 10; // ���O�������ܼ�

	public void show() {
		int var = 20; // �ϰ��ܼ�
		System.out.println("�ϰ��ܼ�var=" + var);
		System.out.println("�����ܼ�var=" + this.var); // �z�Lthis�s�������ܼ�

	}

}
