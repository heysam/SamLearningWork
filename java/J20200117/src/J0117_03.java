
//�HCcar3���O����¦
/*
�إߤT�ӫغc�l�A���O���ǤJ0,1,2,�ӰѼƪ��غc�l
��l��gas�Btbo���
*/

public class J0117_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ccar3 car1 = new Ccar3();
		System.out.println("���a�J�Ѽƪ����[���o�i��p" + car1.getDist() + "km");   //����MaxDist

		Ccar3 car2 = new Ccar3(40, 5);
		System.out.println("�a�J�Ѽƪ����[���o�i��p" + car2.getDist() + "km");    //�a�JgetDist �A�b���W�� setValue�A�b���� maxDist

		Ccar3 car3 = new Ccar3(64.5, 9.2);
		System.out.println("�a�J�G�ӰѼƪ����[���o�i��p" + car3.getDist() + "km");
	}

}


class Ccar3 {
	private double gas = 50;
	private double tbo = 12;
	private double max_dist;

	private void setGas(double g) {      //private ��k
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

	public Ccar3(double g) {          //�@�ӰѼƪ��غc�l
		setGas(g);
		maxDist();
	}

	public Ccar3(double g, double t) { //��ӰѼƪ��غc�l
		setGas(g);
		setTbo(t);
		maxDist();
	}

	public double getDist() {
		return max_dist;
	}
}