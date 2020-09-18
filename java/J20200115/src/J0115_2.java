/*
 	外部程式存取private等級的成員變數
		呼叫public之函式，存取private的成員變數
					public private同一類別
 */
public class J0115_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CMyClass X = new CMyClass();             //宣告MyClass類別物件
		CMyClass Y = new CMyClass();
		X.initVar();                             		   	  		//  x var =1
		Y.initVar();                      					         //  y var =1

		X.addVar(10);                 				      //Var + b =1+10
		System.out.print("物件X\t");
		X.showVar();                                        //ShowVar方法 在同個class 用pubic 呼叫 private 的realShow 方法
																		//主方法執行ShowVar方法並執行realShow方法
		System.out.print("物件Y\t");
		Y.addVar(5);
		Y.showVar();

		System.out.print("物件Y\t");
		Y.addVar(3);
		Y.showVar();
	}
}

class CMyClass {
	public void initVar() {                //公用方法 initVar
		Var = 1;
	}
	public void addVar(int b) {     //公用方法 addVar
		Var = Var + b;
	}
	public void showVar() {            //公用方法showVar
		realShow();                              //執行realShow()方法
	}
	private int Var;

	private void realShow() {
		System.out.println("Var=" + Var);
	}

}