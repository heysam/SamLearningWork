//�h�h�~��
/*
 * Java �N�����~�����Y
*�������O 
*    �����O   
*    �l���O    
*�T�h�H�W�Y���h�h���Y
*�~�Ӫ��h�ƶV�h�B�U�����O������V�j
*�غc�l���檺���ǥѤW���U
*		�@���~�����Y���A�Ѥl���O�غc�lĲ�o
*		�����O�غc�l�AĲ�o�ä����۰ʡB���
*			�۰�:
*			���:super(�Ѽ�)�B������b�I�s���Ĥ@��
 * */
/*
 * �T�h�H�W�غc�l����:(�H�T�h����)
 * �l���O�غc�lĲ�o�����O�غc�l
 * �����O�غc�lĲ�o�դ����O�غc�l
 * �غc�l���涶��: �������O=>�I���O=>�l���O
 * */
/*�[�c��
 * =============���h���~��(�h��)
 * ���O Cshape2                        |         ���� ICircle2
 *          area.show()                   |                  pi,show(),computeArea()
 * --------------------------- -|-----------------
 *                  ���OCCircle2
 *                          radius,computeArea()
*================
 *                   
 *������
 * �l          java�����\
 * */
public class J0120_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CC1 objC1 = new CC1();             //�I�spublic CC1() {varC = 1;} 
		CC1 objC2 = new CC1(10);        // �I�spublic CC1(int i) {varC = i;}
		CC1 objC3 = new CC1(3, 5);//�I�spublic CC1(int i, int j) {super(i * j);varC = i * j;}
		objC1.show();
		objC2.show();
		objC3.show();
	}
	
}

class CA1 {
	protected int varA;

	public CA1() {varA = 1; } //	public CB1() {varB = 1;}  ���W�I�s

	public CA1(int i) {varA = i;}   // varA=15
}

class CB1 extends CA1 {
	protected int varB;
	public CB1() {varB = 1;}    //	public CC1() {varC = 1;}  ���W�I�s
	public CB1(int i) {
		super(i);                          //�I�spublic CA1(int i) {varA = i;}
		varB = i;
	}
}

class CC1 extends CB1 {
	protected int varC;        
	public CC1() {varC = 1;} //���W�I�s�ACB1�A�S���Ѽƪ��غc�l
	public CC1(int i) {           //CC1 objC2 = new CC1(10);
		varC = i;
	}
	public CC1(int i, int j) {//CC1 objC3 = new CC1(3, 5);
		super(i * j);                // �I�sCB1(int i){super(i);varB=i}
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
CC1 objC1 = new CC1();    //�L�Ѽ�
�I�s: public CC1() {varC=1};
���W�I�s: public CB1() {varB=1};
���W�I�s: public CA1() {varA=1}; ����=>varA=1
���U����: public CB1() {varB=1}; ����=> varB=1
���U����: public CC1() {varC=1}; ����=> varC=1
*/
//varA=1 , varB=1, varC=10
/*
CC1 objC1 = new CC1(10);    //�@�ӰѼ�
�I�s: public CC1(int i) {varC=i};
���W�I�s: public CB1() {varB=1};
���W�I�s: public CA1() {varA=1}; ����=>varA=1
���U����: public CB1() {varB=1}; ����=> varB=1
���U����: public CC1() {varC=i}; ����=> varC=10
�Y�U�h�غc�l���b�Ĥ@��A����super�n����W�h�غc�l�A
�h�۰ʰ���W�h�L�Ѽƪ��غc�l
*/
//varA=15 , varB=15, varC=15
/*
CC1 objC1 = new CC1(3,5);    //�G�ӰѼ�
�I�s: public CC1(int i,int j) {super(i*j);varC=i*j};
���W�I�s: 	public CB1(int i) {super(i);varB = i;}
���W�I�s: public CA1(int i) {varA=i}; ����=>varA=15
���U����: public CB1(int i) {varB=i}; ����=> varB=15
���U����: public CC1(int i,int j) {.....;varC=i*j}; ����=> varC=15
*/