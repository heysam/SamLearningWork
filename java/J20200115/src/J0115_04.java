
//�غc�l�h��
/*
	�a�J���P���A�B�Ӽƪ��Ѽ�
�غc�l�Y���w�q�A�h�|�۰ʲ��͹w�]�غc�l
	�w�]�غc�l���e���šA�Ѽƥ笰��
	�Y�H�w�q�غc�l�hJava���|�إ߹w�]�غc�l
*/
public class J0115_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CMyClass2 X=nelass2();                    //�إ�MyClasss2��X���O����A�éI�sMyClass2���غc�l
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
	public CMyClass2(int a,int b) {                            //�إ�2�Ӿ�ưѼƤl
		VarA = a;
		VarB= a+b;
	}
	public CMyClass2(double a,double b) {      //�إ�2�ӯB�I�Ѽƪ��غc�l
		VarA=a;
		VarB=a*b;
	}
	public void showVar() {
		System.out.println("VarA=" + VarA);
		System.out.println("VarB=" + VarB);
	}
}