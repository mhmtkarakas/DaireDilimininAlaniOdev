import java.util.Scanner;

public class Main {
    public  static void main(String[] args){
        int r;
        double pi=3.14, x;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yaricapini giriniz : ");
        r = inp.nextInt();
        System.out.print("Alanini bulmak istediginiz daire parcasinin acisini giriniz : ");
        x = inp.nextDouble();

        double alan = (pi*(r*r)*x)/360;

        System.out.print("Daire diliminin alani : " +alan);
    }
}