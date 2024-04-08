import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        
        if(a>=3000)
		    System.out.print("book");
        else if(a<3000&& a>=1000)
		    System.out.print("mask");
        else if(a<1000&&a>=500){
            System.out.print("pen");
        }        
        else{
            System.out.print("no");
        }

    }
}