//�~��
/*
 * �غc�l ���涶��
 * �إ߭l�����O(�l)�����
 * �������¦���O(��)�غc�l�A�b����l�����O(�l)�غc�l
 */
public class J0117_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CB2 objB = new CB2(); // �إߤl���O����objB��
													// �|���۰ʩI�s�����O�غc�lCA2�A
													// �A�I�s�l���O�غc�lCB2
		objB.show();
	}

}

class CA2 { // ��¦���O
	protected int varX;

	public CA2() { // CA2�����O�غc�l
		System.out.println("�����O�غc�l���椤.............");
		varX = 10; // �]�wvarX=10
	}
}

class CB2 extends CA2 { // �l���O ���غc�l
	public CB2() {
		System.out.println("�l���O�غc�l���椤.............");
	}

	public void show() {
		System.out.println("varX=" + varX);
	}
}