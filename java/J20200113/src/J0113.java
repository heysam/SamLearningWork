
public class J0113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int lottos[]=new int[6];
			for(int i=1;i<=6;i++) {
				lottos[i-1] = (int)((Math.random()*49)+1);  //數學類別0~小於1
				System.out.println("第" + i + "個隨機亂數為" + lottos[i-1]);
			}
	}
}
//(int)((Math.random()*49)+1)
//0 <= x < 1
//   x49
//0 <= x < 49 
//    +1
//1 <= x <= 50
//     int
//1 <= x <= 49