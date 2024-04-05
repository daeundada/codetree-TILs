import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String[] str=s.split(":");
        int i = Integer.parseInt(str[0]);

        System.out.printf("%d:%s",i+1,str[1]);
    }
}