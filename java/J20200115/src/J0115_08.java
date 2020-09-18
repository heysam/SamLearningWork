
public class J0115_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CMyClass6 X = new CMyClass6(3);              //呼叫一個參數 i 的建構子
		CMyClass6 Y = new CMyClass6(5, 40);
		X.showVar();
		Y.showVar();
	}
}

class CMyClass6 {
	public int VarA;
	private int VarB;

	public CMyClass6() {                //預設建構子
	}

	public CMyClass6(int i) {
		VarA = 1;
		VarB = i;
	}

	public CMyClass6(int a, int b) {
		this(b);
		VarA = a * b;
	}

	public void showVar() {
		System.out.println("VarA=" + VarA);
		System.out.println("VarB=" + VarB);
	}
}