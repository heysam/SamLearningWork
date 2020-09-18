import java.util.Scanner;

/*
陣列
相同的資料型態的變數，儲存多個值，
以一個變數名稱，不同的索引值儲存值
使用:
1.宣告﹔資料型態  陣列名稱[]   //陣列名稱又稱變數名稱 
			    資料型態 [] 陣列名稱
2.建立陣列實體﹔ 陣列名稱 = new 資料型態[ ]
								  (為陣列配置記憶體)
								  (資料型態[]裡面可加入元素個數的數值(可省略))
								  不定型陣列
3.儲存(設定)陣列元素﹔ 
		陣列名稱[索引值]=值	;
	資料型態 陣列名稱[] = new 資料型態[]{
			元素1,元素2,..................
	}
	
	資料型態 正列名稱
	
	資料型態 陣列名稱[];
	陣列名稱 = new 資料型態[元素個數];      //配置記憶體
												(元素個數:確實分配記憶體空間，不省略)
	資料型態 陣列名稱[]= new 資料型態[元素個數];
  */

/*
 public class J0108_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 int students[];
		students = new students[];
		資料型態[] 陣列名稱 =  new 陣列型態[]
		資料型態 陣列名稱[] =  new 陣列型別[]

		int  students[] = new students[];
		students[0]=90;
		students[1]=80;
		students[2]=70;
	}

}
 */
public class J0108_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		double average;
		Scanner keyboardInput = new Scanner(System.in);
		int trades[] = new int[4];
		for (int i = 0; i < trades.length; i++) {
										//陣列名稱.length(正列長度元素個素)
			System.out.print("第" + (i + 1) + "季的營業額: ");
			trades[i] = Integer.parseInt(keyboardInput.nextLine());
			sum = sum + trades[i];
		}
		average = (double) sum / (double) 12;
		System.out.println("=============");
		System.out.println("       年度營業額:" + sum);
		System.out.println("平均個月營業額:" + average);
	}
}
