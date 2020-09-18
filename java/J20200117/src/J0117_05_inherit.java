import java.util.Scanner;

//繼承(inheritance)
/*針對類別，達成程式碼重複使用的目的
 * 類別繼承:
 * 	父類別，基礎類別  =====> 被繼承者
 * 	子類別，衍生類別 =====>      繼承者
 * 	
 * 	衍生類別  將繼承所有基礎類別的特性
 * 	衍生類別  可以使用所以父類別的成員
 * 	衍生類別  還可以建立屬於自己的成員(屬性、方法)	
 */
//宣告:
/*
	class 衍生類別名稱 extends 基礎類別名稱{
		衍生類別內容
		.....
	}
	衍生類別繼承繼承基礎類別的public、protected、package等級封裝、但無法繼承private等級封裝
	宣告為protected等級的封裝、則可被衍生類別存取但不可被外部存取
	建構子 無法被繼承
*/
//單一繼承

public class J0117_05_inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CA objA = new CA();                  //基礎類別objA
		CB objB = new CB();                  //衍生類別objB
		System.out.println("輸入類別CA的objA物件資料");     
		objA.inputX();                           //基礎類別objA物件存取objA
		objA.inputY();
		objA.inputZ();
		System.out.print("類別CA的objA物件");
		objA.show();                           //基礎類別的物件存取objA
		System.out.println("----------------------------------------------");
		System.out.println("輸入類別CB的objB");
		objB.inputX();                     //衍生類別物件 存取基礎類別方法 inputX
		objB.inputY();
		objB.inputZ();
		objB.varX++;                    //存取基礎類別變數
	    objB.varY++;                   //衍生物件objB  可存取父類別 protected 的變數varY
		objB.addOne();               //衍生物件objB  可存取衍生類別
		System.out.print("類別CB的objB物件:");
		objB.show();
	}

}

class CA {                                                                              //基礎類別
	Scanner keyboardInput = new Scanner(System.in);             //輸入
	public int varX;
	protected int varY;                                                     //protected(保護)可以讓子類別存取
	private int varZ;                                                          //private(私人)不能讓子類別存取

	public void inputX() {                                               //父類別裡面的方法
		System.out.print("varX:");
		varX = Integer.parseInt(keyboardInput.nextLine());
	}

	public void inputY() {                                              //父類別裡面的方法
		System.out.print("varY:");
		varY = Integer.parseInt(keyboardInput.nextLine());
	}

	public void inputZ() {                                              //父類別裡面的方法
		System.out.print("varZ:");
		varZ = Integer.parseInt(keyboardInput.nextLine());
	}

	public void show() {
		System.out.println("  varX=" + varX + "  varY=" + varY + "  varZ=" + varZ);
	}
}

class CB extends CA {                                      //CB 繼承CA
	public int varW;

	public void addOne() {
		varX++;                            // 衍生類別裡面可以存取基礎類別�堶悸瘍僂�
		varY++;                           //
		// varZ++;                      //varZ為父類別protected等級變數，衍生類別無法存取
		System.out.println("-addOnePrint-");
	}
}