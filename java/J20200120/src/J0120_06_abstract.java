
//��H���O:Abstract Class
/*����k���t�@�اΦ��A�Y��H��k
 * ��H��k�����Qoverride
 * �Y���O���]�t��H��k�A�h�����O�����ŧi��"��H���O"
 * 
 * ��H���O
 * ��H"���O"�ŧi:----------------
 * abstract class ���O�W��{
 * 
 * }
 * ��H"��k"�ŧi:----------------
 * abstract �^��A ��k�W(�Ѽ�);
 * ----------��H��k�S����k���e
 * 
 * �t����H"��k"�����O�A�@�w�n�ŧi����H"���O"
 * "��H���O"�L�k�Hnew���͹���(����)
 * 						(���D�Ҧ�"��H��k"��override�B���ŧi��"��H���O")
 * "��H���O"�i�]�t"��H��k"�P"�@���k"�A�����@�w�n��"��H��k"
 * "��H���O"�@�w�n�Q�~�ӡA"��H��k"�@�w�n�Qoverride
 * �G��ʸˤ��i��private
 * "��H��k"�S�����e
 * "��H���O"���غc�l
 * 
 * �Y��H���O�����@�Ӥ�k�S���Qoverride�A�h���~�Ӥ��l���O�]�����ŧi����H
 * */
public class J0120_06_abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CSape obj =new CShape(); �]���O��H���O�A���ಣ�ͪ������
		CShape obj1 = new CRect(5.0, 15.0);
		CCircle obj2 = new CCircle(3.0);
		obj1.computeArea(); // �~��obj1
		obj2.computeArea(); // �~��obj2
		System.out.println("�x��");
		obj1.show(); // ��H���O ����ө�H��k
		System.out.print("���");
		obj2.show();
	}

}

abstract class CShape {
	protected double area;

	public void show() {
		System.out.println("area=" + area);
	}

	public abstract void computeArea(); // ��H��k�A�@�w�n�Qoverride

}

class CRect extends CShape { // �Ƽg��q���OcomputeArea��k
	protected double length, width;

	public CRect(double i, double j) {
		length = i;
		width = j;
	}

	@Override
	public void computeArea() {
		area = length * width;
	}
}

class CCircle extends CShape { // �Ƽg��H���OcomputeArea��k
	protected double radius;
	protected final double pi = 3.14;

	public CCircle(double i) {
		radius = i;
	}

	@Override
	public void computeArea() {
		area = radius * radius * pi;
	}

}