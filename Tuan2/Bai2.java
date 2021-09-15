import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x;
        System.out.println("Nhap vao so nguyen x:");
        x=sc.nextInt();
        if(songuyento(x)<2)
        {
            System.out.println(x+" khong phai la so nguyen to");
        }
        else{
            System.out.println(x+" la so nguyen to");
        }
    }
public static int songuyento(int x){
    for(int i=2;i<=Math.sqrt(x);i++){
        if(Math.sqrt(x)%i==0){
      
            return i;
        }
        else{
        
            return 0;
        } 
    }
    return x;
}
}