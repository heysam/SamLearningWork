//����(interface)
/*
 * �����@�Ҧ�����������k
 * ���O���~�Өù�@�����A�p�ϥ�super
 * �h�s�边�|�I�s�����O�����u��
 * */
public class J0120_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			CCircle objCCircle=new CCircle(5.0);
			objCCircle.computeArea();
			objCCircle.show();
	}

}
interface ICircle2{
	double pi=3.14;
	public void show();
	void computeArea();
}

class CShape2{
	protected double area;
	public void show() {
		System.out.println("area=" + area);
	}
}

class CCircle2 extends CShape2 implements ICircle2{ //�J�~�ӤS��@
	protected double radius;
	public CCircle2(double i) {
		radius = i;
	}
	@Override public void computeArea() {
		area=radius *radius *pi;
	}
}