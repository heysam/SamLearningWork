
//Ccar3摸膀娄
/*
ミ篶だ肚0,1,2,把计篶
﹍てgastbo戈
*/

public class J0117_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ccar3 car1 = new Ccar3();
		System.out.println("ぃ盿把计ó骸猳︽緋" + car1.getDist() + "km");   //磅︽MaxDist

		Ccar3 car2 = new Ccar3(40, 5);
		System.out.println("盿把计ó骸猳︽緋" + car2.getDist() + "km");    //盿getDist 呼т setValue磅︽ maxDist

		Ccar3 car3 = new Ccar3(64.5, 9.2);
		System.out.println("盿把计ó骸猳︽緋" + car3.getDist() + "km");
	}

}


class Ccar3 {
	private double gas = 50;
	private double tbo = 12;
	private double max_dist;

	private void setGas(double g) {      //private よ猭
		if (g > 30 && g < 80)
			gas = g;
	}

	private void setTbo(double t) {
		if (t > 4 && t < 20)
			tbo = t;

	}

	private void maxDist() {
		max_dist = gas * tbo;
	}

	public Ccar3() {
		maxDist();
	}

	public Ccar3(double g) {          //把计篶
		setGas(g);
		maxDist();
	}

	public Ccar3(double g, double t) { //ㄢ把计篶
		setGas(g);
		setTbo(t);
		maxDist();
	}

	public double getDist() {
		return max_dist;
	}
}