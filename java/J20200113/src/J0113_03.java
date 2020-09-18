
public class J0113_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lottos[]=new int[6];
		generate_Lottos(lottos);
		System.out.println("樂透號碼如下......");
		for(int i=0;i<6;i++) {
			System.out.print(lottos[i] + "\t");
		}
	}
	public static void generate_Lottos(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)((Math.random()*49)+1);
		System.out.println("第" + (i+1)+"個隨機亂數為" + arr[i]);
		}
	}
}
