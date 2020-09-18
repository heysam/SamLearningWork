import sun.jvm.hotspot.ui.action.ShowAction;

//final 修飾子
/*
 * 宣告在變數:即為常數，其值固定，不可變更
 * 宣告在類別方法:繼承後，不可被override
 * 宣告在賴別:類別不可被繼承
 * */
public class J0120_05_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String str = new String("final修飾字");
		System.out.println("已經宣告是final，"
										+ "故string = new String(\"........\")是錯的，"
										+ "不能再定義");
		//string = new String("........");     //已經宣告是final不能被更改
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
		System.out.println("var已經設訂為final ，public CA3{}有給初值，"
										+ "var1++，為錯");
		// var1++;  //var已經設訂為final ，public CA3{}有給初值
		var2++;
	}

	public final void show() {
		System.out.println("var1=" + var1 + "\t,var2=" + var2);
	}
}

class CB3 extends CA3 {
	public void add() {
		System.out.println("// CB3var1已經再CA3父類別設定為final並設定為初值，"
											+ "故無法修改");
		// var1 = var1 +10; //var1已經再父類別設定為final並設定為初值，故無法修改
		var2 = var1 + var2;
	}
	// public void show() {}
	//Show()已經在父類別宣告為final

}

final class CC3 {
	public int var3;
}
//class CD3 extends CC3{}
//已經宣告為final，為不可被繼承的類別