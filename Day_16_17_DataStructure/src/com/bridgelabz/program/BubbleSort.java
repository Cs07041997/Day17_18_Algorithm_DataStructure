package com.bridgelabz.program;

import com.bridgelabz.utility.AlgorithmUtility;

public class BubbleSort {
	public static void main(String[] args) {
		AlgorithmUtility algorithmUtility = new AlgorithmUtility();
        Integer arr[] = {64, 34, 25, 12, 22, 11, 90};
        algorithmUtility.bubbleSort(arr);
        int n = arr.length;
        System.out.println("Sorted array");
        AlgorithmUtility.printArray(arr, n);

	}

}
