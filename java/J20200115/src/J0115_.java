//����ɦV
/*
 �ݩ�:���󪺯S�ʩΩʽ�
  	�㦳�ݩʭ� �ǥ��ݩʭȧ��ܪ��󪺩ʽ�
  	��٬������ܼ�(���O����)

��k:���󪺦欰�ʧ@
  		�ε{�����禡
  		��٬������禡������k
  		
  		���O�O�P�������󶰦X
  		
�ʸ�:�W�d���O���ϥΪ��A
	�N���O��������]�w�������Υ~���ϥ�
	���ŰϤ�:
		public			  : ����  ����{�����i�s��
		private			  : �p��  �u���\�P���O���s��
		protected		  : �O�@  �P���\�P���O�έl�����O�s��
		ex:	���~�u�t���t�� �㦳�ʸ˩�
				(�ݩ�)��~:�����B��ƥi�s��(public)
				(�ݩ�)�鷺:��(pivate)
				(��k)��~:�ϥΤ� �s�@���~(public)
				(��k):�鷺:�����_��
		ex�x������ �����ݩʡB��k
							   �p���ݩʡB��k
							   
�~��::�N�{���X���ƨϥ�

�h��:��k�ۦP�A�����ӳ����檺���P

Java�����䴩��S��
--------------------------------------------------------------------

Java�����O�ŧi
[�ʸ�][�׹��l] class ���O�W��{
	���O���e (����)
	�����ܼ� (�ݩ�)
	������k (�禡)
}
class �D���O������public
�Q�ŧi��public�����O�i�Qimport

�ŧi���O����
			���O�W�� ����W��
	���ͪ������
			����W�� = new ���O�W��(�Ѽ�.............)
	�⦡�X�@:
				���O�W�� ����W�� = new ���O�W��(�Ѽ�..............)
	���O�ݩʤεo�k���s��
				����W��.�ݩʦW��;
				����W��.��k(�Ѽ�..........)
 */



//�F�����O���إߡB���󪺾ާ@
public class J0115_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCar bus = new CCar();              //�إ�Ccar���O������
		CCar truck = new CCar();          //�إ�Ccar���O������
		CCar taxi = new CCar();             //�إ�Ccar���O������
															    //�ܼƵ��󪫥��ݩ�
		bus.name = "������";               //����s���ݩ�
		bus.wheel = 6;
		bus.person = 40;

		truck.name = "�d��";
		truck.wheel = 8;
		truck.person = 3;

		taxi.name = "�⨮";
		taxi.wheel = 4;
		taxi.person = 5;
		 //taxi.engine = "V16";                          //���i�s���p�����Ū��ݩ�
		 
		System.out.print(bus.name + "��" + bus.wheel + "�ӽ��l");
		System.out.println(",�i��" + bus.person + "�H");
		System.out.print(truck.name + "��" + truck.wheel + "�ӽ��l");
		System.out.println(",�i��" + truck.person + "�H");
		System.out.print(taxi.name + "��" + taxi.wheel + "�ӽ��l");
		System.out.println(",�i��" + taxi.person + "�H");
	}
}

class CCar {      //����package
	public int wheel;
	public int person;
	public String name;
	private String engine;                                 //�u��ΦbCcar�̭��A�]���Oprivate
}

/*
�D���O{
	�D��k(......) {
		�إߨ�q ���O����
		�ާ@�Ӫ������ݩ�
	}
}

��L���O{
	.........
}
*/



