
public class J0113_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lottos[]=new int[6];
		generate_Lottos(lottos);
		System.out.println("�ֳz���X�p�U......");
		for(int i=0;i<6;i++) {
			System.out.print(lottos[i] + "\t");
		}
	}
	public static void generate_Lottos(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)((Math.random()*49)+1);
		System.out.println("��" + (i+1)+"���H���üƬ�" + arr[i]);
		}
	}
}
