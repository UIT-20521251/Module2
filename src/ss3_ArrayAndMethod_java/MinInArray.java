package ss3_ArrayAndMethod_java;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            Random random = new Random();
            a[i] = random.nextInt(100);
        }
        System.out.println("Chuỗi bất kỳ:"+ Arrays.toString(a));
        MinInArray obj = new MinInArray();
        System.out.printf("Giá trị nhỏ nhất trong mảng: "+obj.minIn2DArray(a));
    }
    public int minIn2DArray(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }

        }
        return min;
    }
}
