
public class J1213_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int  i=1 ;  i<=10  ;  i++)
			sum += i;
			System.out.println("1+....+10 = " + sum);
/*
 		�_�l��      ����            ��s��
			 i				i<=10		i++		     ���Gsum+=i
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
			11           X                 ���}�j��											
*/			
	}

}

/*
�j�� �@��3��
(1)for �j��(�p���j��)
		for(�_�l�� ; ���� ; ��s��){
				�ԭz��;
				........
		}
			step 1.�_�l��     �P�_����O�_����        ���� ����ԭz�� ��^for
			step 2.��s��     �P�_����O�_����        ���߰���ԭz�� ��^for
			step 3.��s��     �P�_����O�_����        ���߰���ԭz�� ��^for
			step n.��s��     �P�_����O�_����        ���߰���ԭz�� ��^for
			step n+1��s�� �P�_����O�_����    �����߸��X�j��

*/