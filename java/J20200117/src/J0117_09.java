//繼承
/*
 * 建立cm類別，其中有gmax()方法，此方法可比較兩傳入的參數並傳回最大值
 * 建立cm1 類別繼承自cm類別，
 * 其中有gft()   方法，此方法可產生階層值
 * 執行時帶入參數10，可求出10階乘(10!)=?
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
	System.out.println(a + " 與 " +b + "的最大數為" + bigNum);
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