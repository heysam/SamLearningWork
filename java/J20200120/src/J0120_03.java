
public class J0120_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandSonCMath math2 = new GrandSonCMath();
		math2.getMax(10, 20);
		math2.getFactorial(5);
		math2.getFabonacci(10);
	}

}

class CMath {
	public void getMax(int a, int b) {
		int bigNum;
		if (a > b) {
			bigNum = a;
		} else {
			bigNum = b;
		}
		System.out.println(a + " 籔 " + b + " 程计 " + bigNum);
	}
}

class SonCMath extends CMath {
	public void getFactorial(int a) {
		int ans = 1, i;
		System.out.print(a + "!=");
		for (i = 1; i < a; i++) {
			System.out.print(i + "* ");
			ans *= i;   //1*2*3*4
		}
		ans *= a;     //24*5
		System.out.println(a + "=" + ans);
	}
}

class GrandSonCMath extends SonCMath {
	public void getFabonacci(int a) {
		int firstNum = 0, secondNum = 1;
		System.out.print("禣Α计fab(" + a +")=");
		System.out.print(firstNum + ",  " + secondNum);
		int ans;
		System.out.print("-----");
		for (int i = 2; i <= a; i++) {
			ans = firstNum + secondNum;
			System.out.print("," + ans);
			
			firstNum = secondNum;
			secondNum = ans;

		}
	}
}


/*
CMath                     math2 ㊣getMax()よ猭

SonCMath                 math2 ㊣getFactorial()よ猭

GrandSonCMath     math2 ㊣Fabonacci()よ猭
*/

/*
 10 籔 20 程计 20
5!=1* 2* 3* 4* 5=120
禣Α计fab(10)=0,  1-----,1 -- 
0first0
0second1
1first1
1second1
--------------------------------end
,2 -- 
0first1
0second1
1first1
1second2
--------------------------------end
,3 -- 
0first1
0second2
1first2
1second3
--------------------------------end
,5 -- 
0first2
0second3
1first3
1second5
--------------------------------end
,8 -- 
0first3
0second5
1first5
1second8
--------------------------------end
,13 -- 
0first5
0second8
1first8
1second13
--------------------------------end
,21 -- 
0first8
0second13
1first13
1second21
--------------------------------end
,34 -- 
0first13
0second21
1first21
1second34
--------------------------------end
,55 -- 
0first21
0second34
1first34
1second55
--------------------------------end

 * */

