package boj_5522;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for(int i = 0; i < 5; ++i){
            int a = scanner.nextInt();
            sum += a;
        }

        System.out.println(sum);
    }
}
