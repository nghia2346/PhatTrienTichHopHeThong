import java.util.Scanner;

/**
 * Bai5
 */
public class Bai5 {
    public static void sumSoDuong(int[] a, int n) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap phan tu thu " + i + " : ");
            a[i] = scanner.nextInt();
            if (a[i] > 0) {
                sum =sum+ a[i];
            }
        
       }
       System.out.println("Tong cac so duong trong day la: " + sum);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua day: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        sumSoDuong(a, n);
  
    }
}
