package com.executable.sum_of_digits_of_a_number_until_sum_becomes_single_digit;

public class Test {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(digSum(n));
    }

    private static Integer digSum(int n ) {
        Integer sum = 0;
        while(n > 0 || sum > 9){
            if(n ==0) {
                n = sum;
                sum =0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
