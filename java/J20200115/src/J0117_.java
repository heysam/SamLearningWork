/*
EX:�w�q�����OCcar�A�ŧi�Ҧ��������p�U:
	�̦h���o�qgas�B�����Ӫo�qtbo
	�ŧi�Ҧ���������k�p�U
	�[���o�i��p���Z��maxDist()
	�@��[�o�i��ɶZ��dist()`
*/
/*
���浲�G:car1����T:
						�̤j���o�q: 40.0L
						�����Ӫo�q:13.6km/L
						�[���o�i��p:550.0km
						�[�o30L�i��p:320km
*/
public class J0117_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ccar car1;
		car1 = new Ccar();
		car1.gas = 40;
		car1.tbo = 13.6;
		car1.maxDist();
		double distance = car1.dist(20);
		System.out.println("car1����T:");
		System.out.println("�̤j���o�q:" + car1.gas + "L");
		System.out.println("�����Ӫo�q:" + car1.tbo + "km/L");
		System.out.println("�[���o�i���" + car1.max_dist + "km");
		System.out.println("�[�o20L�i��p" + distance + "km");
	}

}

 class Ccar {
	public double gas, tbo;
	public double max_dist = 0;
	public void maxDist() {
		max_dist = gas * tbo;
	}

	public double dist(double oil) {
		return oil * tbo;
	}
}