//this ����
/*
 * 1.����Ѧ�(this=����)
 	2.�Ϥ������ܼơB�ϰ��ܼ�
 	3. �b�غc�l���I�s��L�غc�l
 	4.������
 * */
public class J0115_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CMyClass7 X = new CMyClass7(5);
		CMyClass7 Y = new CMyClass7(5);
		CMyClass7 Z = X;
		System.out.print("����X�P����Y   ");
		X.compare2Obj(Y);                                                //X �MY���󤣬۵�   ���O�Ȥ��
		
		System.out.print("����X�P����Z     ");
		X.compare2Obj(Z);                                              //X���w��Z  �G�۵�
	}
}
class CMyClass7 {
	private int Var;

	public CMyClass7() {
	}

	public CMyClass7(int i) {            //���ai���غc�l
		Var = i;
	}

	public void compare2Obj(CMyClass7 Obj) {
		if (this == Obj) {									//this �N���O���� 
			System.out.println("�⪫��۵�");                 
		} else {
			System.out.println("�⪫�󤣬۵�");
		}

	}
}