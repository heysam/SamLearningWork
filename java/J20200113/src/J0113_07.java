/*
 以遞迴及迴圈製作數值排序
 顯示排序前後之結果如下:
 未排序: ............................
 以排序: ...........................
 數值資料排序建立為陣列，順序為
 31,72,32,66,15,1,61,24,59,38,71,35,10,96,84,
 78,65,60,11,47
  */

public class J0113_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 31, 72, 32, 66, 15, 1, 61, 24, 59, 38, 71, 35, 10, 96, 84, 78, 65, 60, 11, 47 };
		System.out.print("未排序陣列:");
		printArr(arr);
		qSort(arr, 0, arr.length - 1);
		System.out.print("\n排序後陣列:");
		printArr(arr);
	}

	static void printArr(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
	}

	static void qSort(int[] a, int m, int n) {
		if (m >= n) {
			return;
		}
		int i = m, j = n, pivot = a[(m + n) / 2];
		while (i <= j) {
			while (a[i] < pivot) {
				i++;
			}
			while (a[j] > pivot) {
				j--;
			}

			if (i < j) {
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
				i++;
				j--;
			} else if (i == j) {
				i++;
			}
		}

		qSort(a, m, j);
		qSort(a, i, n);
	}
}