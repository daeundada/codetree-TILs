import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String b = sc.next();
        int c = sc.nextInt();
        String d = sc.next();

        if((b.equals("M")&& a>=19) || (d.equals("M")&&c>=19))
		    System.out.print(1);    
        else{
            System.out.print(0);
        }
    }
}