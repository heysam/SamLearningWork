//�~��
/*
 *�l���O�P�����O�P�W������k=>���override
*override (�Ƽg�B��g) �l  ��  ��(���O�Q�ʪ�)
*1.��g�ʸ˵��Ū��u��V�j����V�p(�Ѥp��j) private=>protected
*						�^�ǫ��A�i�� �ۦP �|���l���O���A 
*						�����O��static ��k�O�S����k�Q��g��
*overload: �h�� �P�@�Ӥ�k���h�Ӥ��P�ƶq �ѼƸ��J
*					�������P�@�����O
*
 */

public class J0117_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CB4 objB = new CB4();
		objB.show();
		objB.show(10);
		objB.show(10.0);
	}

}

class CA4 { // �����O
	public void show() { //�]��super �I�s�����O��show
		System.out.println("�ثe���� �����O ��show()");
	}
}

class CB4 extends CA4 {         //�إ�CB4
//�l���O(CB4)��Show�P�����O(CA4) �O override�����Y
//-----------------------------------------------------------
	public void show() {            //�غc�lshow�A�S���w�]�غc�l
													//�b�����O�]���@��show��k
													//������CB4�̭���show
		System.out.println("�ثe���� �l���O ��show()");
	}
//---------------------------------------------------------	

	// �H�U �l���O show CB4 �Ooverload�����Y

	public void show(int x) {
		System.out.println("�ثe���� �l���O ��show(" + x + ")");
	}

	public void show(double x) {
		System.out.println("�ثe���� �l���O show(double)");
		super.show();     //�I�s�����O��show
	}
}