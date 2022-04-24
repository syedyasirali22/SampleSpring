package com.executable.max_sum_of_k_cons_array_elements;

public class Test {

    public static void main(String[] args) {
        Integer arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        Integer k = 4;
        Integer n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }

    private static Integer maxSum(Integer[] arr, Integer n, Integer k) {
        Integer overallSum = 0;
        Integer currentSum = 0;
        System.out.println(n-k+1);
        for(int i = 0; i < n - k + 1; i ++){
            currentSum = 0;
            for(int j = 0;j < k; j++) {
                currentSum += arr[i+j];
            }
            overallSum = Math.max(overallSum, currentSum);
        }
        return overallSum;

    }

}
