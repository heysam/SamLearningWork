//�~��(inheritance)
/*
 *�l���O�إ��ݩ�ۤv�������ɡA�i�P�����O�����P�W 
 *�p�G�O �ܼ� �P�W�A�h�s���� �N �����O �P�W�ܼ� ����
 *���l���O������ӦP�W�ܼơA�L�O��ӿW�ߪ��ܼ�   
 *(�l���O����ɡA���|�h����I���O���ܼ�)
 		//*�ܼ�
 *         �s���l���O�P�W�ܼơA�h�����s��
 *�p�G�s�������O�P�W�ܼơA��super()����r����
 		//*��k
 *�Y�O��k�P�W override(�Ƽg�B��g)
 */
//this      ==>               ����ۤv
//super  ==> �����O ����ۤv(
// 								ex:�s�������O����
//                                      super.�����O����
//                                     private(�O�@)���Ű��~

/*
 * �b�l���O�����غc�l����I���O���غc�l
 * �h�ϥ�super(�Ѽ�......)�A��������b�l���O�غc�l���Ĥ@��
 */
public class J0117_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CB3 objB = new CB3(10);
		objB.show();
		
		
	}

}

class CA3 { //�����O
	public int varX;         //�����OCA3�������ܼ�VarX

	public CA3() { //�غc�l�A�]���D�{���A�αa�@�ӰѼƪ��G�S�Ψ�
							   //�]��super(i)
		System.out.println("�����O�L�Ѽƫغc�l���椤......"); 
	}

	public CA3(int i) {         //�����OCA3�a�@�ӰѼƪ��غc�l    
		varX = i;
	}
}

class CB3 extends CA3 {     //�l���O�~��CA3���O
	public int varX;                  //�إ߻P�����O�P�W��varX�ܼ�

	public CB3() {    //���g�]�S���Y�A�إ�CB3��   �w�]�غc�l �S�����e 
	}

	public CB3(int i) {                                        //�إ�CB3��  �a�@�ӰѼ�i���غc�l
		super(i);          //�bCB3�غc�l���Ĥ@��A�I�s�I���O�a�@�ӰѼƪ��غc�l
								  //���楲����b���غc�l���Ĥ@��
		varX = 100;       
	}

	public void show() {
		super.varX++;                                                            //�s�������O��varX
		System.out.println("�l���OvarX=" + varX);  //�]���O�b�l���O�̭��A
																							  //�۰����ä����O��
		System.out.println("�����OvarX=" + super.varX);
	}
}