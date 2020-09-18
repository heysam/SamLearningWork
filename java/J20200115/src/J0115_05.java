
public class J0115_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CMyClass3 X = new CMyClass3(5, 40);
		// CMyClass3 Y= new CMyClass3(); //若沒有預設建構子則有錯誤
		X.showVar();
		// Y.showVar();
	}

}

class CMyClass3 {
	public int VarA;
	private int VarB;

	/*
	 * public CMyClass3() { VarA =10; VarB=10; }
	 */
	public CMyClass3(int a, int b) {
		VarA = a;
		VarB = b;
	}

	public void showVar() {
		System.out.println("VarA=" + VarA);
		System.out.println("VarB=" + VarB);
	}
}