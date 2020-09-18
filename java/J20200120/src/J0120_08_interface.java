//����(interface)
//���O��@����
/*
 * �����O���@��
 * �u����k�ŧi���L���e��@
 * �ŧi:
 * 	[�ʸ˵���] interface �����W��{
 * 			�������e(�ܼ�,��k)
 * }
 * ---------------------------------------------
 * ���O��@����:
 * ~class ���O�W�� implements �����W��{
 * 					���O���e......
 * }
 * ---------------------------------------------
 * 	�����L�k���ͪ���
 * 			���ͤ����A��{���ϥι�N���@
 * 	�����S���غc�l
 * 			�S���׹��l�A�]���tstatic
 * �����ܼƥ������w�A��ϭȡA�B���i����
 * */
public class J0120_08_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle1 obj = new CCircle1(5.0);
		obj.computeArea();    //�إߦb�����W���A�Ӥ��O
		obj.show();            //�S�Q�k�P�O�~�Ө�����O�A���i�঳��Ӫ���
	}

}

interface ICircle1 {      //�����w�q�A���i���ܡA���ݳ]�w��final
	double pi = 3.14;

	void show();                         //�S�����e

	void computeArea();
}

class CCircle1 implements ICircle1 { //�إ�CCircle1���O��@iCircle1
	protected double area;
	protected double radius;

	public CCircle1(double i) { //�غc�l
		radius = i;
	}

	@Override              
	public void show() { //override ����show��k
		System.out.println("area=" + area);
	}

	@Override
	public void computeArea() {//override ����computeArea��k
		area = radius * radius * pi;
	}
}