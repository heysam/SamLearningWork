/*
關鍵字:this
類別自己  物件自己(執行)
對於類別來而言， this =類別自己
	產生物件後，對於物件的this = 物件本身
	物件.屬性
		自己
		
		this.var = X.var           x即this     (物件參考(this))
		Java變異類別時
		會自動加入this變數
		this並非類別成員，只能使用在類別中    (this.物件的另一個別名!?)
		
		
		this() 呼叫該類別的建構子 (放在建構子內)
		只能放在賤狗仔中第一行
*/
public class J0115_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CMyClass5 X = new CMyClass5();
		X.show();
	}

}

class CMyClass5 {
	public int var = 10; // 類別的成員變數

	public void show() {
		int var = 20; // 區域變數
		System.out.println("區域變數var=" + var);
		System.out.println("成員變數var=" + this.var); // 透過this存取成員變數

	}

}
