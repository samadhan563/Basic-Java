package hakerrank;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int[] brr = new int[sc.nextInt()];
		for (int i = 0; i < brr.length; i++) {
			brr[i] = sc.nextInt();
		}
		int[] result = missingNumbers(arr, brr);
		for (int num : result)
			System.out.println(num + " ");
	}

	static int[] missingNumbers(int[] arr, int[] brr) {

		Arrays.sort(arr);
		Arrays.sort(brr);
		int[] res = new int[20];
		int count = 0, j = 0;

		for (int i = 0; i < brr.length - 1; i++) {
			if (arr[j] != brr[i] && brr[i] != brr[i + 1]) {
				System.out.println(brr[j]);
			}
			if (arr[j] == brr[i]) {
				j++;
			}

		}
		return res;

		/*
		 * Arrays.sort(arr); Arrays.sort(brr); int k = 0; int count=0; int[] res = new
		 * int[20]; int pre = Integer.MIN_VALUE; for (int i = 0; i < brr.length; i++) {
		 * if (pre == brr[i]) { continue; } if (k < arr.length) { if (brr[i] == arr[k])
		 * { k++; continue; } }
		 * 
		 * res[count++]=brr[i] ; pre = brr[i]; } return res;
		 */
	}
}
/*
 * 10 
 * 203 204 205 206 207 208 203 204 205 206 
 * 13 
 * 203 204 204 205 206 207 205 208
 * 203 206 205 206 204
 */