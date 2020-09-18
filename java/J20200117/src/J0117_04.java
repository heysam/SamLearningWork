//一般方法，就是public
public class J0117_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ccar4 car1 = new Ccar4();
		Ccar4.getObjectNum();               //""""類別" ""方法
		car1.showValue();

		Ccar4 car2 = new Ccar4(40, 5);
		car2.getObjectNum();                //""""""物件"""""方法
		car2.showValue();

		Ccar4 car3 = new Ccar4(64.5, 9.2);
		car1.getObjectNum();              //""""物件""""""""方法
		car3.showValue();
		
	}
}

/*類別是一個抽象的概念，物件是一個實体，
 * 而特徵在Java以屬性相稱，功能則以方法相稱*/
/*
 * class是一個類別，裡面會裝著各種屬性跟方法
 * 屬性是一些直接定義出來的變數
 * 
 * 有 public static void  方法名稱{
 * }                          // 可以直接使用，不用實例化
 * */




class Ccar4 {
	private static int car_num;                    //屬性   類別變數
	private double gas = 50;                      //屬性   類別變數
	private double tbo = 12;                     //屬性     類別變數

	private void setGas(double g) {                    /*setGas方法*/
		if (g > 30 && g < 80)
			gas = g;
	}

	private void setTbo(double t) {                    /*setTbo方法*/
		if (t > 4 && t < 20)
			tbo = t;
	}

	public Ccar4() {           //	建構子 Ccar4() 是未定義的

		car_num++;
	}

	public Ccar4(double g) {
		setGas(g);
		car_num++;
	}

	public Ccar4(double g, double t) {
		setGas(g);
		setTbo(t);
		car_num++;
	}

	public static void getObjectNum() {
		System.out.println("第" + car_num + "部車，");
	}

	public void showValue() {
		System.out.println("最多載油量" + gas + ",平均耗油量" + tbo);
	}
}