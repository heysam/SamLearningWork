import sun.jvm.hotspot.ui.action.ShowAction;

//final �׹��l
/*
 * �ŧi�b�ܼ�:�Y���`�ơA��ȩT�w�A���i�ܧ�
 * �ŧi�b���O��k:�~�ӫ�A���i�Qoverride
 * �ŧi�b��O:���O���i�Q�~��
 * */
public class J0120_05_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String str = new String("final�׹��r");
		System.out.println("�w�g�ŧi�Ofinal�A"
										+ "�Gstring = new String(\"........\")�O�����A"
										+ "����A�w�q");
		//string = new String("........");     //�w�g�ŧi�Ofinal����Q���
		System.out.println(str);
		CB3 obj = new CB3();
		obj.add();
		obj.show();
	}

}

class CA3 {
	public final int var1;
	public int var2;

	public CA3() {
		var1 = 10;
		var2 = 10;
	}

	public void add() {
		System.out.println("var�w�g�]�q��final �Apublic CA3{}������ȡA"
										+ "var1++�A����");
		// var1++;  //var�w�g�]�q��final �Apublic CA3{}�������
		var2++;
	}

	public final void show() {
		System.out.println("var1=" + var1 + "\t,var2=" + var2);
	}
}

class CB3 extends CA3 {
	public void add() {
		System.out.println("// CB3var1�w�g�ACA3�����O�]�w��final�ó]�w����ȡA"
											+ "�G�L�k�ק�");
		// var1 = var1 +10; //var1�w�g�A�����O�]�w��final�ó]�w����ȡA�G�L�k�ק�
		var2 = var1 + var2;
	}
	// public void show() {}
	//Show()�w�g�b�����O�ŧi��final

}

final class CC3 {
	public int var3;
}
//class CD3 extends CC3{}
//�w�g�ŧi��final�A�����i�Q�~�Ӫ����O