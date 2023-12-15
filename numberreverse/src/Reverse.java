import  java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int r =0;
        while(a!=0){
            int d=a%10;
            r=r*10+d;
            a/=10;
        }
        System.out.println((r));

    }


}
