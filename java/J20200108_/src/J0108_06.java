import java.util.Scanner;

//�ۭq�禡
/*
 * public     static    void        main(string[]  args)
[�ʸ˼h��] static �^�ǫ��A ��ƦW(���A1 �Ѽ�1,.....) {
	�{���ԭz;
	return �Ǧ^��;(�Y�L�Ǧ^�ȫh�ٲ� �^�ǫ��A �]��void)
}
*/
public class J0108_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k;
		double Ans;
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("�p��3.5��k����?�п�Jk=");
		k = Integer.parseInt(keyboardInput.nextLine());
		Ans = power(3.5, k);                                                                    //�I�spower�禡�A�a�J3.5 �MK
		System.out.println("3.5��" + k + "����=" + Ans);
	}

	//�إߤ@��pow�禡
	public static double power(double X, int n) {                        // 3.5�a�JX�Ak�a�Jn        
		int i;
		double powerXn = 1;
		for (i = 1; i <= n; i++) {
			powerXn = powerXn * X;
		}
		return powerXn;                                         //�Ǧ^������̩I�s��Ans
	}
}
/*
poertX    =     powerXn     *           X
                              1               *         3.5    
     3.5
                             3.5            *         3.5
3.5*3.5
                         (3.5*3.5)      *          3.5
3.5*3.5*3.5
*/

//�禡���I�s 
/*
 	�禡�W��(�Ѽ�........ )              �L�Ǧ^��
 	�ܼ�=�禡�W��(�Ѽ�.........)           ���Ǧ^��
*/
