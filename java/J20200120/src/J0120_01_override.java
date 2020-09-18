
//override註記(註解)
/*
 *註解:編譯氣跳過不編譯，工設計者觀看
 * @override:工設計者觀看，編譯器會解讀
 * 類別a a1()方法
 * 類別b 繼承自類別a需要複寫a1()方法
 * 若類別a在其他檔案內容須複寫
 * 		如需複寫，則須在方法前加@override
 * 告知編譯器複寫方法
 * */
public class J0120_01_override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CB objB = new CB();
		objB.show();
		objB.show(10);
		objB.show(10.0);
	}

}

class CA {
	public void show() {
		System.out.println("目前執行父類別的show()");
	}
}

class CB extends CA {

	@Override // @override告知編譯器複寫父類別的方法，主要是跨檔案
	public void show() {
		System.out.println("目前執行子類別的show()");
	}

	public void show(int x) {
		System.out.println("目前執行子類別的show(int " + x + ")");
	}

	public void show(double x) {
		System.out.println("目前執行子類別的show(double  " + x + ")");
		super.show(); // 呼叫父類別
	}
}
