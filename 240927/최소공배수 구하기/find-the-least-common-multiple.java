import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        
        int n=num.nextInt();
        int m=num.nextInt();

        int count=1;

        while(true){

            if(count%n==0 && count%m==0){
                break;
            }

            count++;
        }

        System.out.printf("%d",count);
    }
}