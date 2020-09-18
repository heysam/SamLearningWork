
public class J0115_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			CMyClass4 X = new CMyClass4();
			X.show();
	}

}

class CMyClass4{
	public int var=10;            //類別的成員變數
	public void show() {
		int var=20;                  //區域變數
		System.out.println("var=" + var);
		
	}
}