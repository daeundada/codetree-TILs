import java.util.*;

public class Main {
    
    public static ArrayList<Integer> sum(int a, int b){

        ArrayList<Integer> intList = new ArrayList(); 

        if(a<b){
            a+=10;
            b*=2;
        }else{
            b+=10;
            a*=2;
        }
        intList.add(a);
        intList.add(b);
        
        return intList;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        ArrayList<Integer> intList = sum(a,b);

        System.out.printf("%d %d",intList.get(0),intList.get(1));
    }
}