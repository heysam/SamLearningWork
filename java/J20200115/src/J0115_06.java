
public class J0115_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			CMyClass4 X = new CMyClass4();
			X.show();
	}

}

class CMyClass4{
	public int var=10;            //���O�������ܼ�
	public void show() {
		int var=20;                  //�ϰ��ܼ�
		System.out.println("var=" + var);
		
	}
}