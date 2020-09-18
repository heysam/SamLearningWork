
public class J1206_06 {
	/*
	字串轉數值  使用內建類別之方法(Double,parseDouble)
	數值轉字串 1.string 類別中的valueOf() 方法
						  2.各型別類別to String()方法
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short a = 100;
		int b = 200;
		float d = 3.5f;
		double e = 4.8d;
		String s1 , s2;
						
		s1 = String.valueOf(a+b) +         //字串 a是short=100 ,  b是int=200
					   String.valueOf(a) +        //100
					   String.valueOf(b);          // 200
		s2 = Float.toString(d) +             //字串 d是float=3.5
				 Double.toString(e);           // e是double=4.8
		System.out.println("s1 = " + s1);      //s1 = 300100200
		System.out.println("s2 = " + s2);      //s2 = 3.54.8
	}
}
/*
valueOf()為多載(覆載)(overload)方法，可接受任何型別的資料
各型別類別之to String()必須以各類別型別資料為主
*/	



