package com.prowing.java;

import java.util.Arrays;

public class FindSecondHighestFromGivenArray {
	public static void main(String[] args) {
		System.out.println("main started");
		int[] nums = { 10, 8, 20, 12, 5 };
		System.out.println("original array :" + Arrays.toString(nums));
		int secondHighestNumber = findSecondHighestNumber(nums);
		System.out.println("secondHighestNumber from given array is:" + secondHighestNumber);
		System.out.println("main ended");
	}

	public static int findSecondHighestNumber(int[] nums) {
		int temp = 0;

//		 step 1= sort the array
		for (int i = 0; i < nums.length; i++)

		{
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.println("after sorting:" + Arrays.toString(nums));
//		step 2= return 2nd highest number
		return nums[nums.length - 2];
	}

}
