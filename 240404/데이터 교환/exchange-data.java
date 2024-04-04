public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        int c=7;

        b=a;
        c=b;
        a=c;

        System.out.println(a);
        System.out.println(b);
        System.out.print(c);
    }
}