/*
 	�~���{���s��private���Ū������ܼ�
		�I�spublic���禡�A�s��private�������ܼ�
					public private�P�@���O
 */
public class J0115_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CMyClass X = new CMyClass();             //�ŧiMyClass���O����
		CMyClass Y = new CMyClass();
		X.initVar();                             		   	  		//  x var =1
		Y.initVar();                      					         //  y var =1

		X.addVar(10);                 				      //Var + b =1+10
		System.out.print("����X\t");
		X.showVar();                                        //ShowVar��k �b�P��class ��pubic �I�s private ��realShow ��k
																		//�D��k����ShowVar��k�ð���realShow��k
		System.out.print("����Y\t");
		Y.addVar(5);
		Y.showVar();

		System.out.print("����Y\t");
		Y.addVar(3);
		Y.showVar();
	}
}

class CMyClass {
	public void initVar() {                //���Τ�k initVar
		Var = 1;
	}
	public void addVar(int b) {     //���Τ�k addVar
		Var = Var + b;
	}
	public void showVar() {            //���Τ�kshowVar
		realShow();                              //����realShow()��k
	}
	private int Var;

	private void realShow() {
		System.out.println("Var=" + Var);
	}

}