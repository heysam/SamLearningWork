//override
/*
 * �����O���A���ܼƥi�ѦҨ�l���O���������
 * �i�z�L���ܼư���l���O����override
 * �����i��g�l���O��W����k
 * (�~�����Y)
 * */
public class J0120_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CA2 obj = new CB2(); // �����OCA2��obj����ѦҨ�l���OCB2
		System.out.println("'�����OCA2��obj����ѦҨ�l���OCB2=>'");
		obj.show1(); // ����l���Ooverride����k
		obj.show2(); // ��������O�~�ӹL�Ӫ�����k
		// obj.show3(); //���� �A�����O���i���� �l���Oshow3����k
		System.out.println("obj.show3()����  �A�����O���i���� �l���Oshow3����k");

	}

}

class CA2 {
	protected int varA;

	public void show1() {
		System.out.println("						�����Oshow1()���椤");
	}

	public void show2() { // �����Oshow2
		System.out.println("'�l���O�S��Show2()�G��������O��'");
		System.out.println("					�����Oshow2()���椤");
	}
}

class CB2 extends CA2 {
	protected int varB;

	@Override
	public void show1() { // �l���Oshow1
		System.out.println("					�l���O��g��show1()���椤");
	}

	public void show3() { // �l���Oshow3
		System.out.println("					�l���O�s�W��show3()���椤");
	}
}