
import java.util.Scanner;
public class traing_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int quota , pay;
			float hold;
			Scanner keyboardInput = new Scanner(System.in);   			//Java進來的是字串，不用轉型態
			System.out.print("請輸入信用額度:");
				quota = Integer.parseInt(keyboardInput.nextLine());
			System.out.print("繳款是否正常:");
				pay = Integer.parseInt(keyboardInput.nextLine());
				if ((pay !=0) || (pay !=1))
				{
					if (pay !=1) {
						System.out.print("預借現金金額為0");
					} else {
						System.out.print("請輸入持卡年份");
						hold = Float.parseFloat(keyboardInput.nextLine());
						if (hold < 0.5)
						{
							System.out.print("無法預借現金");
						}else if (hold >=0.5 &&  hold <1) {
							System.out.printf("預借現金金額為"  +  quota * 0.2); 
						}else if (hold >=1) {
							System.out.printf("預借現金金額為" + quota * 0.1) ;
						}
					}
				}else {
					System.out.print("無法預計現金");
				}
				
	}
}
/*
 信用額度
繳款是否正常
持卡狀況
輸入物件keyboardinput
請輸入信用額度 <=keyboardinput  應該要正數

繳款是否正常變數的值1或0去判斷
如果可以藉，再繼續
 */