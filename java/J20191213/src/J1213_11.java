
public class J1213_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		for (i=1 ; i<=7; i++) {                          //������
				for (j=7 ; j>i ; j--) {                       //����L�ť�
					System.out.print(" ");
				}
				for (k =1 ; k <=2*i-1 ; k++) {     //�t�d�L "*"   (2*i-1 �@�w�O���)�A����ƭ�2�A��@ �O���
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