
//抽象類別:Abstract Class
/*為方法的另一種形式，即抽象方法
 * 抽象方法必須被override
 * 若類別中包含抽象方法，則此類別必須宣告為"抽象類別"
 * 
 * 抽象類別
 * 抽象"類別"宣告:----------------
 * abstract class 類別名稱{
 * 
 * }
 * 抽象"方法"宣告:----------------
 * abstract 回船型態 方法名(參數);
 * ----------抽象方法沒有方法內容
 * 
 * 含有抽象"方法"的類別，一定要宣告為抽象"類別"
 * "抽象類別"無法以new產生實體(物件)
 * 						(除非所有"抽象方法"皆override且未宣告為"抽象類別")
 * "抽象類別"可包含"抽象方法"與"一般方法"，但不一定要有"抽象方法"
 * "抽象類別"一定要被繼承，"抽象方法"一定要被override
 * 故其封裝不可為private
 * "抽象方法"沒有內容
 * "抽象類別"有建構子
 * 
 * 若抽象類別中有一個方法沒有被override，則其繼承之子類別也必須宣告為抽象
 * */
public class J0120_06_abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CSape obj =new CShape(); 因為是抽象類別，不能產生物件實體
		CShape obj1 = new CRect(5.0, 15.0);
		CCircle obj2 = new CCircle(3.0);
		obj1.computeArea(); // 繼承obj1
		obj2.computeArea(); // 繼承obj2
		System.out.println("矩形");
		obj1.show(); // 抽象類別 有兩個抽象方法
		System.out.print("圓形");
		obj2.show();
	}

}

abstract class CShape {
	protected double area;

	public void show() {
		System.out.println("area=" + area);
	}

	public abstract void computeArea(); // 抽象方法，一定要被override

}

class CRect extends CShape { // 複寫抽量類別computeArea方法
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

class CCircle extends CShape { // 複寫抽象類別computeArea方法
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