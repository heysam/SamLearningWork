//介面(interface)
//類別實作介面
/*
 * 為類別的一中
 * 只有方法宣告但無內容實作
 * 宣告:
 * 	[封裝等級] interface 介面名稱{
 * 			介面內容(變數,方法)
 * }
 * ---------------------------------------------
 * 類別實作介面:
 * ~class 類別名稱 implements 介面名稱{
 * 					類別內容......
 * }
 * ---------------------------------------------
 * 	介面無法產生物件
 * 			產生介面，當程式使用實將其實作
 * 	介面沒有建構子
 * 			沒有修飾子，也不含static
 * 成員變數必須給定，初使值，且不可改變
 * */
public class J0120_08_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle1 obj = new CCircle1(5.0);
		obj.computeArea();    //建立在介面上面，而不是
		obj.show();            //沒被法同是繼承兩個類別，不可能有兩個爸爸
	}

}

interface ICircle1 {      //介面定義，不可改變，不需設定為final
	double pi = 3.14;

	void show();                         //沒有內容

	void computeArea();
}

class CCircle1 implements ICircle1 { //建立CCircle1類別實作iCircle1
	protected double area;
	protected double radius;

	public CCircle1(double i) { //建構子
		radius = i;
	}

	@Override              
	public void show() { //override 介面show方法
		System.out.println("area=" + area);
	}

	@Override
	public void computeArea() {//override 介面computeArea方法
		area = radius * radius * pi;
	}
}