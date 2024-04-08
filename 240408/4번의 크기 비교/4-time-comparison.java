import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();        

        b= a>b?1:0;
        c= a>c?1:0;
        d= a>d?1:0;
        e= a>e?1:0;

        System.out.printf("%d\n%d\n%d\n%d",b,c,d,e);
    }
}