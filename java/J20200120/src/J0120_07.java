//抽象類鼻多層繼承
public class J0120_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CMyRect1 obj = new CMyRect1(5.0,15.0);
		obj.computeArea();
		obj.show();
	}

}

abstract class CShape1 {
	protected double area;

	public abstract void show();

	public abstract void computeArea();

}

abstract class CRect1 extends CShape1 {
	protected double length, width;

	public CRect1(double i, double j) {
		length = i;
		width = j;
	}

	@Override
	public void computeArea() {
		area = length * width;
	}
}

class CMyRect1 extends CRect1 {
	public CMyRect1(double i, double j) {
		super(i, j);
	}

	@Override
	public void show() {
		System.out.println("矩形area=" + area);
	}
}
