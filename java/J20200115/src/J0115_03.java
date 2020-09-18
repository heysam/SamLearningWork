import org.graalvm.compiler.api.replacements.Snippet.VarargsParameter;

//建構子(constructor)  (類別)
/*
建構函式   (方法)
	跟類別名稱相同的方法
	建立物件實體時自動執行(new 產生物件實體時被自動呼叫)
	名稱與類別名稱相通
	功用:設定初始值
	沒有回傳值，也不可設定為void
*/


//建立建構子
public class J0115_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CMyClass1 X = new CMyClass1(1);    //建立X物件，自動呼叫MyCMyClass1建構子出來執行 並帶1
		CMyClass1 Y = new CMyClass1(2);     //建立X物件，自動呼叫MyCMyClass1建構子出來執行 並帶2
		//物件類別子執行時，自動帶入參數
		X.addVar(10);
		System.out.print("物件X\t");
		X.showVar();

		System.out.print("物件Y\t");
		Y.addVar(5);
		Y.showVar();

		System.out.print("物件Y\t");
		Y.addVar(3);
		Y.showVar();
	}
}

class CMyClass1 {
	public CMyClass1(int i) { // 建構子
		Var = i;
	}

	public void addVar(int b) { // 公用方法 addVar
		Var = Var + b;
	}

	public void showVar() { // 公用方法showVar
		realShow(); // 執行realShow()方法
	}

	private int Var;

	private void realShow() {
		System.out.println("Var=" + Var);
	}
}
