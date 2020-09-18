//繼承
/*
 * 建構子 執行順序
 * 建立衍生類別(子)物件時
 * 先執行基礎類別(父)建構子，在執行衍生類別(子)建構子
 */
public class J0117_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CB2 objB = new CB2(); // 建立子類別物件objB時
													// 會先自動呼叫父類別建構子CA2，
													// 再呼叫子類別建構子CB2
		objB.show();
	}

}

class CA2 { // 基礎類別
	protected int varX;

	public CA2() { // CA2父類別建構子
		System.out.println("父類別建構子執行中.............");
		varX = 10; // 設定varX=10
	}
}

class CB2 extends CA2 { // 子類別 的建構子
	public CB2() {
		System.out.println("子類別建構子執行中.............");
	}

	public void show() {
		System.out.println("varX=" + varX);
	}
}