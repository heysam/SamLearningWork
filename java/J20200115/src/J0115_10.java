//實體變數/方法
/*
	必須要有實體方法操作
					實體(new) 有實際記憶體位址
	必須以物件名稱從取
	實體需要加上static(修飾詞)
類別變數/方法
		以類別為存取方式(類別名.變數方法)
		必須以static修飾字宣告  (需告隸屬於類別)
		加static這個方法隸屬於類別
*/
public class J0115_10 {

	public int Var;                     //實體變數
	public static int sVar;        //類別變數

	public void show(String str) {            //因為沒有static所以為實體的方法
		System.out.println(str + "'s                             Var=" + Var);
		System.out.println("J0115_10 class      sVar=" + sVar);
	}

	public static void add() {                //類別方法
		//Var++;        //必須用物件名稱來存取，類別方法不能存實體變數的， 實體變數議定要用物件來存取
		sVar++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J0115_10 X = new J0115_10();
		J0115_10 Y = new J0115_10();
		X.Var = 3;
		Y.Var = 10;
		X.sVar = 5;
		X.add();
		Y.add();
		X.show("X");
		Y.show("Y");
	}

}

類別的屬性
類別的方法