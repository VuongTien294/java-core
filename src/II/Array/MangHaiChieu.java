package II.Array;

import java.util.Scanner;

public class MangHaiChieu {
    private static void test() {
        int number[][] = new int[2][3];
        //=> 1 mảng 2 chiều gồm 2 dòng và 3 cột sẽ tương ứng với 2 mảng 1 chiều (mỗi mảng chứa 3 phần tử)

        //khai báo mảng kieru gán giá trị
        int diem[][] = {{1, 3}, {6, 4}, {5, 10}};
        //=> nảng này có 3 dòng mỗi dòng 2 cột => 3 list : list 1 có phần tử là 1, 3 ; list 2 có phần tử là 6 , 4 ;...

        //Số dòng trong mảng cũng bắt đầu index từ 0 nên giá trị bên dưới nó sẽ lấy từ dòng t3 (hay có index = 2) và có index trong dòng T3 là 1 (hay giá trị T2 trong mảng)
        System.out.println("Phần tử nằm ở dòng 2 và cột 1 là :" + diem[2][1]);

        System.out.println("Mảng diem là: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(diem[i][j] + "\t");
            }
            // sau khi viết xong 1 dòng thi xuống hàng
            System.out.println("\n");
        }
    }

    //Bài 1 : Tính tổng 2 ma trận
    //Nhập m, n là số dòng và 2 số cột của 2 ma trận 2 chiều A và B từ bàn phím.
    //Nhập giá trị cho các phần tử cho 2 ma trận này.
    //Tính và in ra màn hình ma trận C là tổng của 2 ma trận này.
    //Yêu cầu kỹ thuật: Kiểm tra số dòng, số cột nhập vào không được nhỏ hơn 1.
    private static void tinhTongHaiMaTran() {
        int m;  // số dòng của ma trận
        int n;  // số cột của ma trận
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số dòng của ma trận:");
            m = scanner.nextInt();
            System.out.println("Nhập vào số cột của ma trận:");
            n = scanner.nextInt();
        } while (m < 1 || n < 1);

        // khai báo 2 ma trận A và B có m dòng và n cột
        int A[][] = new int[m][n];
        int B[][] = new int[m][n];

        // ma trận tổng C
        int C[][] = new int[m][n];

        System.out.println("Nhập các phần tử cho ma trận A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "," + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Nhập các phần tử cho ma trận B:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("B[" + i + "," + j + "] = ");
                B[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma trận A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("Ma trận B:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println("\n");
        }

        // Để tính tổng hai ma trận
        // ta sẽ sử dụng 2 vòng lặp for
        // để duyệt i từ 0 đến m và j từ 0 đến n
        // sau đó tính tổng hai phần tử
        // tại vị trí i, j tương ứng của 2 ma trận A, B
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // hiển thị ma trận tổng C
        System.out.println("Ma trận tổng C:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    //Bài 2 : Một ma trận được gọi là ma trận thưa nếu số phần tử có giá trị bằng 0 nhiều hơn số phần tử khác 0. Viết chương trình thực hiện các công việc sau
    //Nhập m, n là số dòng và số cột của ma trận hai chiều A từ bàn phím.
    //Nhập giá trị các phần tử của ma trận A từ bàn phím.
    //Kiểm tra và thông báo lên màn hình ma trận vừa nhập là ma trận thưa hay ma trận không thưa.
    //Yêu cầu kỹ thuật: Kiểm tra số dòng, số cột nhập vào không được nhỏ hơn 1
    private static void maTranThua() {
        int m, n;
        int soPhanTu0 = 0;      // số phần tử = 0 trong ma trận
        int soPhanTuKhac0 = 0;  // số phần tử khác 0 trong ma trận
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số dòng của ma trận:");
            m = scanner.nextInt();
            System.out.println("Nhập vào số cột của ma trận:");
            n = scanner.nextInt();
        } while (m < 1 || n < 1);

        // khai báo ma trận A có m dòng, n cột
        int A[][] = new int[m][n];

        System.out.println("Nhập các phần tử cho ma trận A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "," + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma trận A vừa nhập:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] == 0) {
                    soPhanTu0++;
                } else {
                    soPhanTuKhac0++;
                }
            }
        }

        if (soPhanTu0 > soPhanTuKhac0) {
            System.out.println("Đây là ma trận thưa");
        } else {
            System.out.println("Đây không phải ma trận thưa");
        }
    }

    //Bài 3 : Ma trận đối xứng
    //Ma trận A nhập vào phải luôn luôn là một ma trận vuông.
    //Kiểm tra phần tử nằm dưới đường chéo chính có bằng phần tử đối xứng với nó qua đường chéo chính hay không (chạy từ trên xuống dưới và từ trái qua phải là đường chéo chính)
    // (tức là kiểm tra các phần tử A[i][j] có bằng A[j][i] không, với i, j chạy từ 0 đến n).
    private static void maTranVuong() {
        int n;  // bậc của ma trận
        int kt = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số bậc của ma trận: ");
            n = scanner.nextInt();
        } while (n < 1);

        // ma trận A là ma trận vuông
        // có n dòng và n cột
        int[][] A = new int[n][n];

        System.out.println("Nhập các phần tử cho ma trận A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "," + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma trận A vừa nhập:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }

        // kiểm tra các phần tử nằm dưới đường chéo chính
        // và phần tử đối xứng với nó qua đường chéo chính
        // có bằng nhau hay không
        // nếu bằng nhau thì ma trận đó là ma trận đối xứng
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i][j] == A[j][i]) {
                    kt = 1;
                } else {
                    kt = 0;
                }
            }
        }

        if (kt == 1) {
            System.out.println("Ma trận vừa nhập là ma trận đối xứng");
        } else {
            System.out.println("Ma trận vừa nhập là ma trận không đối xứng");
        }

        //Ma trận : 3,1,2,1,0,3,2,3,0 là ma trận đối xứng
    }

    public static void main(String[] args) {
//        test();
//        tinhTongHaiMaTran();
//        maTranThua();
        maTranVuong();

    }
}
