//多層繼承
/*
 * Java 將垂直繼承關係
*祖父類別 
*    父類別   
*    子類別    
*三層以上即為多層關係
*繼承的層數越多、下方類別的實體越大
*建構子執行的順序由上往下
*		一般繼承關係中，由子類別建構子觸發
*		父類別建構子，觸發嘔分為自動、手動
*			自動:
*			手動:super(參數)、必須放在呼叫的第一行
 * */
/*
 * 三層以上建構子執行:(以三層為例)
 * 子類別建構子觸發父類別建構子
 * 父類別建構子觸發組父類別建構子
 * 建構子執行順序: 祖父類別=>富類別=>子類別
 * */
/*架構圖
 * =============類多重繼承(多型)
 * 類別 Cshape2                        |         介面 ICircle2
 *          area.show()                   |                  pi,show(),computeArea()
 * --------------------------- -|-----------------
 *                  類別CCircle2
 *                          radius,computeArea()
*================
 *                   
 *父父父
 * 子          java不允許
 * */
public class J0120_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CC1 objC1 = new CC1();             //呼叫public CC1() {varC = 1;} 
		CC1 objC2 = new CC1(10);        // 呼叫public CC1(int i) {varC = i;}
		CC1 objC3 = new CC1(3, 5);//呼叫public CC1(int i, int j) {super(i * j);varC = i * j;}
		objC1.show();
		objC2.show();
		objC3.show();
	}
	
}

class CA1 {
	protected int varA;

	public CA1() {varA = 1; } //	public CB1() {varB = 1;}  往上呼叫

	public CA1(int i) {varA = i;}   // varA=15
}

class CB1 extends CA1 {
	protected int varB;
	public CB1() {varB = 1;}    //	public CC1() {varC = 1;}  往上呼叫
	public CB1(int i) {
		super(i);                          //呼叫public CA1(int i) {varA = i;}
		varB = i;
	}
}

class CC1 extends CB1 {
	protected int varC;        
	public CC1() {varC = 1;} //往上呼叫，CB1，沒有參數的建構子
	public CC1(int i) {           //CC1 objC2 = new CC1(10);
		varC = i;
	}
	public CC1(int i, int j) {//CC1 objC3 = new CC1(3, 5);
		super(i * j);                // 呼叫CB1(int i){super(i);varB=i}
		varC = i * j;
	}

	public void show() {
		System.out.print("varA=" + varA + "\t");
		System.out.print("varB=" + varB + "\t");
		System.out.println("     varC=" + varC);
	}
}

//varA=1 , varB=1, varC=1
/*
CC1 objC1 = new CC1();    //無參數
呼叫: public CC1() {varC=1};
往上呼叫: public CB1() {varB=1};
往上呼叫: public CA1() {varA=1}; 執行=>varA=1
往下執行: public CB1() {varB=1}; 執行=> varB=1
往下執行: public CC1() {varC=1}; 執行=> varC=1
*/
//varA=1 , varB=1, varC=10
/*
CC1 objC1 = new CC1(10);    //一個參數
呼叫: public CC1(int i) {varC=i};
往上呼叫: public CB1() {varB=1};
往上呼叫: public CA1() {varA=1}; 執行=>varA=1
往下執行: public CB1() {varB=1}; 執行=> varB=1
往下執行: public CC1() {varC=i}; 執行=> varC=10
若下層建構子未在第一行，註明super要執行上層建構子，
則自動執行上層無參數的建構子
*/
//varA=15 , varB=15, varC=15
/*
CC1 objC1 = new CC1(3,5);    //二個參數
呼叫: public CC1(int i,int j) {super(i*j);varC=i*j};
往上呼叫: 	public CB1(int i) {super(i);varB = i;}
往上呼叫: public CA1(int i) {varA=i}; 執行=>varA=15
往下執行: public CB1(int i) {varB=i}; 執行=> varB=15
往下執行: public CC1(int i,int j) {.....;varC=i*j}; 執行=> varC=15
*/