
public class J1206_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short s = 23;
		int a = 100;
		char b = 'a';
		float c = 3.5f;
		double d= 4.8d;
		System.out.print("result= ");
		System.out.println((s+a-b+c)+(c*d));
		/*
		short             int               char                               float                           float              double                  
		   (23      +     100     -    a(�୼ascii=97)    +      3.5)               +          (3.5f       *         4.8d)
		         int(123)	                int(26)                       float(29.5)       +                 double(16.8d)
		         ______________________________________                           46.3d
		 */
	}

}
/*
 (�j���ഫ�����O)    ���,�ܼ�,�B�⦡
int a = 15 ,int b=6,c =a/b
c=(float)a/(float)b
c=2.5
*/

/*
��l����ƫ��O          �����������O
Byte                                  Byte                                             Byte()
short                                Short                                            Short()
int                                     Integer                                         Int()
long                                 Long                �ഫ��k .parseLong()
boolean                          Boolean                                       Boolean()
char                                 Character                                    Char()
float                                Float                                              Float()
double                           Double                                         Double()
*/

