//繼承(inheritance)
/*
 *子類別建立屬於自己的成員時，可與父類別成員同名 
 *如果是 變數 同名，則存取時 將 父類別 同名變數 隱藏
 *父子類別中的兩個同名變數，他是兩個獨立的變數   
 *(子類別執行時，不會去執行富類別的變數)
 		//*變數
 *         存取子類別同名變數，則直接存取
 *如果存取父類別同名變數，用super()關鍵字執行
 		//*方法
 *若是方法同名 override(複寫、改寫)
 */
//this      ==>               物件自己
//super  ==> 父類別 物件自己(
// 								ex:存取父類別成員
//                                      super.父類別成員
//                                     private(保護)等級除外

/*
 * 在子類別中的建構子執行富類別的建構子
 * 則使用super(參數......)，此必須放在子類別建構子的第一行
 */
public class J0117_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CB3 objB = new CB3(10);
		objB.show();
		
		
	}

}

class CA3 { //父類別
	public int varX;         //父類別CA3的成員變數VarX

	public CA3() { //建構子，因為主程式，用帶一個參數的故沒用到
							   //因為super(i)
		System.out.println("父類別無參數建構子執行中......"); 
	}

	public CA3(int i) {         //父類別CA3帶一個參數的建構子    
		varX = i;
	}
}

class CB3 extends CA3 {     //子類別繼承CA3類別
	public int varX;                  //建立與父類別同名的varX變數

	public CB3() {    //不寫也沒關係，建立CB3的   預設建構子 沒有內容 
	}

	public CB3(int i) {                                        //建立CB3的  帶一個參數i的建構子
		super(i);          //在CB3建構子中第一航，呼叫富類別帶一個參數的建構子
								  //此行必須放在此建構子的第一航
		varX = 100;       
	}

	public void show() {
		super.varX++;                                                            //存取父類別的varX
		System.out.println("子類別varX=" + varX);  //因為是在子類別裡面，
																							  //自動隱藏父類別的
		System.out.println("父類別varX=" + super.varX);
	}
}