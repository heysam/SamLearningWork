//this 結論
/*
 * 1.物件參考(this=物件)
 	2.區分成員變數、區域變數
 	3. 在建構子中呼叫其他建構子
 	4.物件比較
 * */
public class J0115_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CMyClass7 X = new CMyClass7(5);
		CMyClass7 Y = new CMyClass7(5);
		CMyClass7 Z = X;
		System.out.print("物件X與物件Y   ");
		X.compare2Obj(Y);                                                //X 和Y物件不相等   不是值比較
		
		System.out.print("物件X與物件Z     ");
		X.compare2Obj(Z);                                              //X指定給Z  故相等
	}
}
class CMyClass7 {
	private int Var;

	public CMyClass7() {
	}

	public CMyClass7(int i) {            //有帶i的建構子
		Var = i;
	}

	public void compare2Obj(CMyClass7 Obj) {
		if (this == Obj) {									//this 代表的是物件 
			System.out.println("兩物件相等");                 
		} else {
			System.out.println("兩物件不相等");
		}

	}
}