import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,tong;
        System.out.println("Nhap so nguyen n");
        n=sc.nextInt();
        tong=0;
        for(int i=0;i<=n;i++){
      
            tong=tong+i;

    }
    System.out.println("Tong tu 1 toi n la " + tong);

}
}
