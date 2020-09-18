/*
以Ccar類別為基礎，改變封裝層級
將gas,tbo,max_dist,maxDist(r均設為private)
使外部無法直接存取
另建立setValue(),getDist()方法　封裝層級均設為public存取private層級的資訊
*/

public class J0117_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ccar2 car1 = new Ccar2();
		double g1 = 40, t1 = 15;
		car1.setValue(g1, t1);        //car1物件執行setValue方法，帶入g1、t1
		double distance1 = car1.getDist();
		System.out.println("car1加滿油可行使" + distance1 + "km");
		
		Ccar2 car2 = new Ccar2();
		car2.setValue(60, 11);
		System.out.println("car2加滿油可行駛" + car2.getDist() + "km");
	}

}

class Ccar2 {                                        // 定義依類別Ccar，宣告所有的成員如下:
	private double gas, tbo;             // 最多載油量gas、平均耗油量tbo
	private double max_dist;

	private void maxDist() {
		max_dist = gas * tbo;
	}

	public void setValue(double g, double t) {
		gas = g;                                         // 呼叫本方法的g 設定給gas
		tbo = t;                                          // 呼叫本方法的t 設定給gas
		maxDist();                                     // 執行方法maxDist
	}

	public double getDist() {
		return max_dist; // 傳回 private max_dist
	}

}