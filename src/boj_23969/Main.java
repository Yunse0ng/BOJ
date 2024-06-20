package boj_23969;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        int count = 0;

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            arr.add(scanner.nextInt());
        }

        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - i; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    if (count == b) {
                        break;
                    }
                    swap(arr, j, j + 1);
                    count++;
                }
            }
        }
        if (count < b) System.out.println(-1);
        else {
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
    }

    public static void swap(ArrayList<Integer> arr, int first, int second) {
        int temp;
        temp = arr.get(first);
        arr.set(first, arr.get(second));
        arr.set(second, temp);
    }
}
