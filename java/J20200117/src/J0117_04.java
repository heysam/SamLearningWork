//�@���k�A�N�Opublic
public class J0117_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ccar4 car1 = new Ccar4();
		Ccar4.getObjectNum();               //""""���O" ""��k
		car1.showValue();

		Ccar4 car2 = new Ccar4(40, 5);
		car2.getObjectNum();                //""""""����"""""��k
		car2.showValue();

		Ccar4 car3 = new Ccar4(64.5, 9.2);
		car1.getObjectNum();              //""""����""""""""��k
		car3.showValue();
		
	}
}

/*���O�O�@�ө�H�������A����O�@�ӹ��^�A
 * �ӯS�x�bJava�H�ݩʬۺ١A�\��h�H��k�ۺ�*/
/*
 * class�O�@�����O�A�̭��|�˵ۦU���ݩʸ��k
 * �ݩʬO�@�Ǫ����w�q�X�Ӫ��ܼ�
 * 
 * �� public static void  ��k�W��{
 * }                          // �i�H�����ϥΡA���ι�Ҥ�
 * */




class Ccar4 {
	private static int car_num;                    //�ݩ�   ���O�ܼ�
	private double gas = 50;                      //�ݩ�   ���O�ܼ�
	private double tbo = 12;                     //�ݩ�     ���O�ܼ�

	private void setGas(double g) {                    /*setGas��k*/
		if (g > 30 && g < 80)
			gas = g;
	}

	private void setTbo(double t) {                    /*setTbo��k*/
		if (t > 4 && t < 20)
			tbo = t;
	}

	public Ccar4() {           //	�غc�l Ccar4() �O���w�q��

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
		System.out.println("��" + car_num + "�����A");
	}

	public void showValue() {
		System.out.println("�̦h���o�q" + gas + ",�����Ӫo�q" + tbo);
	}
}