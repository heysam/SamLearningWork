import org.graalvm.compiler.api.replacements.Snippet.VarargsParameter;

//�غc�l(constructor)  (���O)
/*
�غc�禡   (��k)
	�����O�W�٬ۦP����k
	�إߪ������ɦ۰ʰ���(new ���ͪ������ɳQ�۰ʩI�s)
	�W�ٻP���O�W�٬۳q
	�\��:�]�w��l��
	�S���^�ǭȡA�]���i�]�w��void
*/


//�إ߫غc�l
public class J0115_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CMyClass1 X = new CMyClass1(1);    //�إ�X����A�۰ʩI�sMyCMyClass1�غc�l�X�Ӱ��� �ña1
		CMyClass1 Y = new CMyClass1(2);     //�إ�X����A�۰ʩI�sMyCMyClass1�غc�l�X�Ӱ��� �ña2
		//�������O�l����ɡA�۰ʱa�J�Ѽ�
		X.addVar(10);
		System.out.print("����X\t");
		X.showVar();

		System.out.print("����Y\t");
		Y.addVar(5);
		Y.showVar();

		System.out.print("����Y\t");
		Y.addVar(3);
		Y.showVar();
	}
}

class CMyClass1 {
	public CMyClass1(int i) { // �غc�l
		Var = i;
	}

	public void addVar(int b) { // ���Τ�k addVar
		Var = Var + b;
	}

	public void showVar() { // ���Τ�kshowVar
		realShow(); // ����realShow()��k
	}

	private int Var;

	private void realShow() {
		System.out.println("Var=" + Var);
	}
}
