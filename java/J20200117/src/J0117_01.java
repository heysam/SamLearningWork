/*
EX:定義依類別Ccar，宣告所有的成員如下:
	最多載油量gas、平均耗油量tbo
	宣告所有的成員方法如下
	加滿油可行駛長距離maxDist()
	一般加油可行時距離dist()`
*/
/*
執行結果:car1車資訊:
						最大載油量: 40.0L
						平均耗油量:13.6km/L
						加滿油可行駛:550.0km
						加油30L可行駛:320km
*/
public class J0117_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ccar car1;
		car1 = new Ccar();                                   //實利化
		car1.gas = 40;                                          //最大載油量: 40.0L
		car1.tbo = 13.6;                                      //平均耗油量:13.6km/L
		car1.maxDist();                                       //加滿油可行駛maxDist
		double distance = car1.dist(30);        //加油30L可行駛dist
		System.out.println("car1車資訊:");
		System.out.println("最大載油量:" + car1.gas + "L");
		System.out.println("平均耗油量:" + car1.tbo + "km/L");
		System.out.println("加滿油可行使" + car1.max_dist + "km");
		System.out.println("加油20L可行駛" + distance + "km");
	}
}

class Ccar { // 定義依類別Ccar，宣告所有的成員如下:
	public double gas, tbo; // 最多載油量gas、平均耗油量tbo
	public double max_dist = 0;

	public void maxDist() { // //宣告成員方法maxDist()， "加滿油"可行駛長距離
		max_dist = gas * tbo;
	}

	public double dist(double oil) { // 宣告成員方法dist() ， "一般加油"可行時距離
		return oil * tbo;
	}
}