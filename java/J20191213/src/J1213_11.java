
public class J1213_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		for (i=1 ; i<=7; i++) {                          //北︽计
				for (j=7 ; j>i ; j--) {                       //北フ
					System.out.print(" ");
				}
				for (k =1 ; k <=2*i-1 ; k++) {     //璽砫 "*"   (2*i-1 ﹚琌膀计)ヴ计2搭 琌膀计
					System.out.print("*");
				}
			System.out.println();
		}
	}

}
/*
       *
     ***
    *****
   *******
  *********
 ***********
*************
*/