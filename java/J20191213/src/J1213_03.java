import java.util.Scanner;
public class J1213_03 {
		//JDK7以前SWITCH沒有判斷字串
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardInput = new Scanner(System.in);   			//Java進來的是字串，不用轉型態
		//利用輸入物件keyboardinput取得字串
		System.out.print("請輸入JAVA等第ex:優等、甲等~丁等:");
		switch (keyboardInput.nextLine()) {
					//將取得的數入字串，與優等做比對
			case "優等":  
				System.out.println("JAVA成績等第為A");
				break;
			case "甲等":
				System.out.println("JAVA成績等第為B");
				break;
			case "乙等":
				System.out.println("JAVA成績等第為C");
				break;
			case "丙等":
				System.out.println("JAVA成績等第為D");
				break;
			case "丁等":
				System.out.println("JAVA成績等第為E");
				break;
			default:
				System.out.println("您輸入了錯誤的等第");
				break;				
		}
	}

}
/*
巢狀條件式
if (條件1){
	敘述1;
		if(條件2){
			if(條件3){
				...
				...
			}		
		}
	}

*/