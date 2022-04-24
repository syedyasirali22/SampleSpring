package com.executable.sum_of_digits_of_a_number;

public class Test {
    public static void main(String[] args) {
        Integer n = 687;
        System.out.println(sum(n));
    }

    private static Integer sum(Integer n) {
        Integer sum  = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
