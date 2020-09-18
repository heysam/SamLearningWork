
//篶更
/*
	盿ぃ篈计把计
篶璝ゼ﹚竡玥穦笆玻ネ箇砞篶
	箇砞篶ず甧把计ョ
	璝﹚竡篶玥Javaぃ穦ミ箇砞篶
*/
public class J0115_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CMyClass2 X=nelass2();                    //ミMyClasss2X摸ン㊣MyClass2篶
		CMyClass2 Y=new CMyClass2(5,40);
		CMyClass2 Z=new CMyClass2(20.2,30.6);
		X.showVar();
		Y.showVar();
		Z.showVar();
		
	}
}

class CMyClass2 {
	public double VarA;
	private double VarB;
	
	public CMyClass2() {
		VarA =10;
		VarB=10;
	}
	public CMyClass2(int a,int b) {                            //ミ2俱计把计
		VarA = a;
		VarB= a+b;
	}
	public CMyClass2(double a,double b) {      //ミ2疊翴把计篶
		VarA=a;
		VarB=a*b;
	}
	public void showVar() {
		System.out.println("VarA=" + VarA);
		System.out.println("VarB=" + VarB);
	}
}