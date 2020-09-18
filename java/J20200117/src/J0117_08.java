//繼承
/*
 *子類別與父類別同名的之方法=>交用override
*override (複寫、改寫) 子  改  父(父是被動的)
*1.改寫封裝等級的只能越大不能越小(由小改大) private=>protected
*						回傳型態可為 相同 會為子類別型態 
*						父類別的static 方法是沒有辦法被改寫的
*overload: 多載 同一個方法有多個不同數量 參數載入
*					必須位於同一個類別
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

class CA4 { // 父類別
	public void show() { //因為super 呼叫父類別的show
		System.out.println("目前執行 父類別 的show()");
	}
}

class CB4 extends CA4 {         //建立CB4
//子類別(CB4)的Show與父類別(CA4) 是 override的關係
//-----------------------------------------------------------
	public void show() {            //建構子show，沒有預設建構子
													//在父類別也有一個show方法
													//先執行CB4裡面的show
		System.out.println("目前執行 子類別 的show()");
	}
//---------------------------------------------------------	

	// 以下 子類別 show CB4 是overload的關係

	public void show(int x) {
		System.out.println("目前執行 子類別 的show(" + x + ")");
	}

	public void show(double x) {
		System.out.println("目前執行 子類別 show(double)");
		super.show();     //呼叫父類別的show
	}
}