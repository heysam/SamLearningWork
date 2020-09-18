
public class J1213_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int  i=1 ;  i<=10  ;  i++)
			sum += i;
			System.out.println("1+....+10 = " + sum);
/*
 		起始值      條件            更新值
			 i				i<=10		i++		     結果sum+=i
			1				V										1 = 0+1
			2				V					V					3 = 1+2
			3				V					V					6 = (1 + 2) + 3
			4				V					V				  10= (3 + 3) + 4
			5				V					V				  15= (6 + 4) + 5
			6				V					V				  21= (10+5)+ 6
			7				V					V				  28= (15+6)+ 7
			8				V					V				  36= (21+7)+ 8
			9				V					V				  45= (28+8)+ 9
			10		    V                 V               55=(46+9)+10
			11           X                 離開迴圈											
*/			
	}

}

/*
迴圈 共有3種
(1)for 迴圈(計次迴圈)
		for(起始值 ; 條件 ; 更新值){
				敘述式;
				........
		}
			step 1.起始值     判斷條件是否成立        成立 執行敘述式 返回for
			step 2.更新值     判斷條件是否成立        成立執行敘述式 返回for
			step 3.更新值     判斷條件是否成立        成立執行敘述式 返回for
			step n.更新值     判斷條件是否成立        成立執行敘述式 返回for
			step n+1更新值 判斷條件是否成立    不成立跳出迴圈

*/