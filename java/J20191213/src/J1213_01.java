import java.util.Scanner;
//	if-else if:多條件式
//	if(條件式1) {
//		敘述1;
//	}else if (條件式2) {
//		敘述2;
//	}else if (條件n) {
//		敘述n;
//	}else {
//		敘述n+1;
//	}
//	逐一判斷條件式
//	若某一條件成立
//	則執行該敘述式
//	所有條件都不成立
//	則執行敘述n+1
public class J1213_01 {
	public static void main(String[] args) {
				// TODO Auto-generated method stub
		Scanner keyboardInput = new Scanner(System.in);
		int Score;
		System.out.print("請輸入JAVA成績:");
		Score = Integer.parseInt(keyboardInput.nextLine());
		if (Score < 60) {
			System.out.println("分數為丁等");
		}else if(Score <= 69) {
			System.out.println("分數為丙等");
		}else if (Score <= 79) {
			System.out.println("分數為乙等等");
		}else if (Score <= 89) {
			System.out.println("分數為甲等");
		}else if (Score <= 99) {
			System.out.println("分數為優等等");
		}else if (Score == 100) {
			System.out.println("完美分數");
		}else {
			System.out.println("您輸入了不合法的分數");
		}
	}

}
