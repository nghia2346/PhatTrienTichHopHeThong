import java.util.Scanner;



public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,c,delta;
        System.out.println("Nhap vao a:");
        a=sc.nextFloat();
        System.out.println("Nhap vao b:");
        b=sc.nextFloat();
        System.out.println("Nhap vao c:");
        c=sc.nextFloat();
        delta=b*b-4*a*c;
        Bai3.giaiPTBac2(a, b, c);
    }
    public static void giaiPTBac2(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong tỉnh vo nghiem");
            } else {
                System.out.println("Phuong trinh co mot nghiem "
                        + "x = " + (-c / b));
            }
            return;
        }
     
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
     
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("phuong trinh co 2 nghiem la "
                    + "x1 = " + x1 + " va x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phuong trinh co nghiem kep "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}