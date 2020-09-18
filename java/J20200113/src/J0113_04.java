import java.util.Scanner;

public class J0113_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int workArr[] = { 43, 23, 67, 27, 39, 15, 39, 37, 57, 26, 14 };
		int findNum, location;
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("請輸入您要找的數值:");
		findNum = Integer.parseInt(keyboardInput.nextLine());
		location = seqSearch(findNum, workArr);
		if (location == -1) {
			System.out.println("在陣列中找不到要找的數值");
		} else {
			System.out.println("數值" + findNum + "為值work[" + location + "]");
		}
	}

	public static int seqSearch(int target, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (target == arr[i]) {
				return i;
			}
		}
		return -1;
	}
}
