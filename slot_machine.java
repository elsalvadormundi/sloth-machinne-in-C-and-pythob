import java.util.Random;
import java.util.Scanner;
public class sloth_machie {
    public static void main(String[] args){
         while(true){
            sloth();
         }
    }
    public static void sloth(){
        int var_1 = 0;
        int var_2 = 0;
        int var_3 = 0;
        int win = 0;
        int lose = 0;
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number of spin:");
        int user_input = scan.nextInt();
        for(int d=1; d<=user_input; ++d){
            System.out.println("---"+d+"---");
            for(int e=0; e<5; ++e){
                var_1 = rand.nextInt(4);
                var_2 = rand.nextInt(4);
                var_3 = rand.nextInt(4);
                System.out.println(var_1+"-"+var_2+"-"+var_3);
            }
            if (var_1==var_2 && var_2==var_3 && var_3==var_1){++win;}
            else{++lose;}
        }
        System.out.println("you won for : "+win+" you lose for : "+lose);
	}
}
