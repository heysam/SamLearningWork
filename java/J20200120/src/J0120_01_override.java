
//override���O(����)
/*
 *����:�sĶ����L���sĶ�A�u�]�p���[��
 * @override:�u�]�p���[�ݡA�sĶ���|��Ū
 * ���Oa a1()��k
 * ���Ob �~�Ӧ����Oa�ݭn�Ƽga1()��k
 * �Y���Oa�b��L�ɮפ��e���Ƽg
 * 		�p�ݽƼg�A�h���b��k�e�[@override
 * �i���sĶ���Ƽg��k
 * */
public class J0120_01_override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CB objB = new CB();
		objB.show();
		objB.show(10);
		objB.show(10.0);
	}

}

class CA {
	public void show() {
		System.out.println("�ثe��������O��show()");
	}
}

class CB extends CA {

	@Override // @override�i���sĶ���Ƽg�����O����k�A�D�n�O���ɮ�
	public void show() {
		System.out.println("�ثe����l���O��show()");
	}

	public void show(int x) {
		System.out.println("�ثe����l���O��show(int " + x + ")");
	}

	public void show(double x) {
		System.out.println("�ثe����l���O��show(double  " + x + ")");
		super.show(); // �I�s�����O
	}
}
