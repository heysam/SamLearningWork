//介面(interface)
/*
 * 必續實作所有介面中的方法
 * 類別中繼承並實作介面，如使用super
 * 則編輯器會呼叫父類別成員優先
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

class CCircle2 extends CShape2 implements ICircle2{ //既繼承又實作
	protected double radius;
	public CCircle2(double i) {
		radius = i;
	}
	@Override public void computeArea() {
		area=radius *radius *pi;
	}
}