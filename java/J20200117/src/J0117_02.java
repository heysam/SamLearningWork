/*
�HCcar���O����¦�A���ܫʸ˼h��
�Ngas,tbo,max_dist,maxDist(r���]��private)
�ϥ~���L�k�����s��
�t�إ�setValue(),getDist()��k�@�ʸ˼h�ŧ��]��public�s��private�h�Ū���T
*/

public class J0117_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ccar2 car1 = new Ccar2();
		double g1 = 40, t1 = 15;
		car1.setValue(g1, t1);        //car1�������setValue��k�A�a�Jg1�Bt1
		double distance1 = car1.getDist();
		System.out.println("car1�[���o�i���" + distance1 + "km");
		
		Ccar2 car2 = new Ccar2();
		car2.setValue(60, 11);
		System.out.println("car2�[���o�i��p" + car2.getDist() + "km");
	}

}

class Ccar2 {                                        // �w�q�����OCcar�A�ŧi�Ҧ��������p�U:
	private double gas, tbo;             // �̦h���o�qgas�B�����Ӫo�qtbo
	private double max_dist;

	private void maxDist() {
		max_dist = gas * tbo;
	}

	public void setValue(double g, double t) {
		gas = g;                                         // �I�s����k��g �]�w��gas
		tbo = t;                                          // �I�s����k��t �]�w��gas
		maxDist();                                     // �����kmaxDist
	}

	public double getDist() {
		return max_dist; // �Ǧ^ private max_dist
	}

}