//override
/*
 * 父類別型態的變數可參考到子類別的物件實體
 * 可透過該變數執行子類別中的override
 * 但不可改寫子類別行增的方法
 * (繼承關係)
 * */
public class J0120_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CA2 obj = new CB2(); // 父類別CA2的obj物件參考到子類別CB2
		System.out.println("'父類別CA2的obj物件參考到子類別CB2=>'");
		obj.show1(); // 執行子類別override的方法
		obj.show2(); // 執行父類別繼承過來的的方法
		// obj.show3(); //有錯 ，父類別不可執行 子類別show3的方法
		System.out.println("obj.show3()有錯  ，父類別不可執行 子類別show3的方法");

	}

}

class CA2 {
	protected int varA;

	public void show1() {
		System.out.println("						父類別show1()執行中");
	}

	public void show2() { // 父類別show2
		System.out.println("'子類別沒有Show2()故執行父類別的'");
		System.out.println("					父類別show2()執行中");
	}
}

class CB2 extends CA2 {
	protected int varB;

	@Override
	public void show1() { // 子類別show1
		System.out.println("					子類別改寫的show1()執行中");
	}

	public void show3() { // 子類別show3
		System.out.println("					子類別新增的show3()執行中");
	}
}