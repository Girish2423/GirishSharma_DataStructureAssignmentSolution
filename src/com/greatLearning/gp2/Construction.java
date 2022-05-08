package com.greatLearning.gp2;

import java.util.*;

public class Construction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no. of floors in the building");
		int totFloor = sc.nextInt();
		int[] arr = new int[totFloor];
		for (int i = 0; i < totFloor; i++) {
			System.out.println("Enter the floor size given on day: " + (i + 1));
			arr[i] = sc.nextInt();
		}

		System.out.println("The order of Construction is as follows");
		int val = totFloor;
		for (int j = 0; j < totFloor; j++) {

			System.out.println("Day: " + (j + 1));

			if (arr[j] == val) {
				if (j != 0) {
					int size = j + 1;

					System.out.println(val + " ");
					val--;

					for (int k = size - 2; k >= 0; k--) {

						if (arr[k] == val) {
							System.out.println(val + " ");
							val--;
						}
					}

				} else {
					System.out.println(val);
					val--;
				}

			}

		}

	}

}
