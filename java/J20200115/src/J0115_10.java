//�����ܼ�/��k
/*
	�����n�������k�ާ@
					����(new) ����ڰO�����}
	�����H����W�ٱq��
	����ݭn�[�Wstatic(�׹���)
���O�ܼ�/��k
		�H���O���s���覡(���O�W.�ܼƤ�k)
		�����Hstatic�׹��r�ŧi  (�ݧi���ݩ����O)
		�[static�o�Ӥ�k���ݩ����O
*/
public class J0115_10 {

	public int Var;                     //�����ܼ�
	public static int sVar;        //���O�ܼ�

	public void show(String str) {            //�]���S��static�ҥH�����骺��k
		System.out.println(str + "'s                             Var=" + Var);
		System.out.println("J0115_10 class      sVar=" + sVar);
	}

	public static void add() {                //���O��k
		//Var++;        //�����Ϊ���W�٨Ӧs���A���O��k����s�����ܼƪ��A �����ܼ�ĳ�w�n�Ϊ���Ӧs��
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

���O���ݩ�
���O����k