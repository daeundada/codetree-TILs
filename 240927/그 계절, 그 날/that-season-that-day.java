import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int Y = scanner.nextInt();
        int M = scanner.nextInt();
        int D = scanner.nextInt();

        int month = -1;
        String season = "";

        if(M==1||M==3||M==5||M==7||M==8||M==10||M==12){
            if(D<=31){
                month = M;
            }
        }else if(M==4||M==6||M==9||M==11){
            if(D<=30){
                month = M;
            }
        }else if(M==2){
            if(Y%4==0){
                if(Y%100==0 && Y%400!=0){
                    if(D<=28){
                        month = M;
                    }
                }else{
                    if((D<=29)){
                        month = M;
                    }
                }
            }else{
                if(D<=28){
                    month = M;
                }
            }
        }

        if(month ==-1){
            System.out.printf("-1");
        }else if(month>=3 && month<=5){
            System.out.printf("Spring");
        }else if(month>=6 && month<=8){
            System.out.printf("Summer");
        }else if(month>=9 && month<=11){
            System.out.printf("Fall");
        }else if(month>=12 || month<=2){
            System.out.printf("Winter");
        }
    }
}