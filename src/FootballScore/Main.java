package FootballScore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        first obj1 = new first();
        second obj2 = new second();
        HQReport obj = new HQReport();

        obj.register(obj1);
        obj.register(obj2);
        
        while(true){
            System.out.print("Enter Score ");
            String score = sc.nextLine();
            obj.setSomeData(score);
        }
    }
}
