package II.Array;

import java.util.Scanner;

public class MangMotChieu {

    //Tạo mảng gồm n phần tử từ bàn phím nếu n <= 2 hoặc n > max -1 thì phải nhập lại
    private static void sapXep() {
        int n, temp, max = 100;
        Scanner scanner = new Scanner(System.in);

        int A[] = new int[max];

        do {
            System.out.println("Nhập số phần tử của mảng :");
            n = scanner.nextInt();
        } while (n <= 2 || n > max - 1);

        //Nhập giá trị cho các phần tử trong mảng
        System.out.println("Nhập các phần tử của mảng : ");
        for (int i = 0; i < n; i++) {
            System.out.println("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        System.out.println("Mảng ban đầu là : ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j <= n - 1; j++) {
                if (A[j] < A[i]) {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }

        // in ra màn hình mảng số sau khi sắp xếp
        System.out.println("\nMảng sau khi sắp xếp: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }
    }

    public static void main(String[] args) {
        sapXep();
    }
}
