import java.util.Scanner;
public class J1213_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardInput = new Scanner(System.in);
		int Score;
		System.out.print("請輸入JAVA成績:");
		Score = Integer.parseInt(keyboardInput.nextLine());
		if ((Score >= 0) && Score<=100) {   //設定分數條件為0~100
			 //Score除以10 當作條件運算式 ex:85 分 除以10得到是8 不是8.5因為我們宣告Score為int
			switch (Score / 10 ) {   
				case 10:
					System.out.println("完美分數");
					break;
				case 9:
					System.out.println("分數等級為優等");
					break;
				case 8:
					System.out.println("分數等級為甲等等");
					break;
				case 7:
					System.out.println("分數等級為乙等");
					break;
				case 6:
					System.out.println("分數等級為丙等");
					break;
				default:
					System.out.println("分數等級為丁等");
					break;
			}
		}else {
			System.out.println("您輸入了不合法的分數");
		}
		
	}

}

/*
switch~case:
switch(整數 運算式) {      //比對   是否吻合比對case1、case2
case 整數條件值1;
	敘述1;
	break;                          	//	直接結束並且離開
	
case 整數條件值n;
	敘述n;
	break;
default                        //所有接不吻合則執行
	敘述n+1;
	break;
}
*/