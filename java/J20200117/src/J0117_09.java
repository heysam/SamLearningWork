//�~��
/*
 * �إ�cm���O�A�䤤��gmax()��k�A����k�i�����ǤJ���ѼƨöǦ^�̤j��
 * �إ�cm1 ���O�~�Ӧ�cm���O�A
 * �䤤��gft()   ��k�A����k�i���Ͷ��h��
 * ����ɱa�J�Ѽ�10�A�i�D�X10����(10!)=?
 * */
public class J0117_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cm1 math1 = new cm1();
		math1.gmax(10, 20);
		System.out.println();
		math1.gft(10);
		
		
	}

}

class cm {
	public void gmax(int a,int b) {
		int bigNum;
			if (a>b) {
				bigNum=a;	
			}else {
				bigNum = b;	
			}
	System.out.println(a + " �P " +b + "���̤j�Ƭ�" + bigNum);
	}
}
class cm1 extends cm {
	public void gft(int a) {
		int ans = 1,i;
		System.out.print(a+ "!=");
		for(i=1;i<a;i++) {
			System.out.print(i+"*");
			ans *=i;
		}
		ans *=a;
		System.out.println(a+"=" + ans);
		
	}
}