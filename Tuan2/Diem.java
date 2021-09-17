import java.util.Scanner;

public class Diem {
    int x, y;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           Diem A = new Diem();
           Diem B = new Diem();
           A.gantoado(5, 5);
           B.nhaptoado();
           A.inmanhinh();
           B.inmanhinh();
           System.out.println(" Khoang cach tu A den goc toa do: "+ A.khoangcach());
            System.out.println("Khoang cach tu B den goc toa do: 7"+ B.khoangcach());
    }
  
    void gantoado(int x,int y){
        this.x=x;
        this.y=y;
    }
    void nhaptoado(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap toa do x :");
            x=sc.nextInt();
            System.out.println("Nhap toa do y :");
            y=sc.nextInt();
            gantoado(x, y);
    }
    void inmanhinh(){
        System.out.println("("+ x +","+y+")");
    }
    double khoangcach(){
        double khc=Math.sqrt(this.x*this.x+this.y*this.y);
        return khc;
    }
}
