import java.util.Scanner;
public class J1206_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		//建立一個Scanner，附屬到System.in，此時可以使用Scanner類的各種方法來讀取輸入
		System.out.print("請輸入計概成績:");
		int score1 = scn.nextInt();      //讀近來是整數，宣告也是整數
		System.out.print("請輸入Java成績:");
		int score2 = scn.nextInt();
		System.out.print("請輸入電子學成績:");
		int score3 =  scn.nextInt();
		System.out.printf("平均分數 =%6.2f \n", (float) (score1 + score2 + score3 )/3);
	}
	/*
	%6.2f將浮點數值格式化為總位數6位  (包含小數點)
														 小數2位
	 */
}
