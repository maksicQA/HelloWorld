package main.helloworld;

import java.util.Scanner;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        System.out.println("Hello World");
        System.out.println("Nenad Maksic");
        
        int age = 5;
        if (age > 18){
            System.out.println("Osoba je punoletna");
        } else {
            System.out.println("Osoba je maloletna");
        } */

              
        System.out.print("Type your age number");
        Scanner input = new Scanner(System.in);
        int userAge = input.nextInt();
       /*
        System.out.println("Korisnik je uneo: " + userAge);
        
        if (userAge > 18){
            System.out.println("Osoba je punoletna");
        } else {
             System.out.println("Osoba je maloletna");
        }
        */
       /* 
       
        if (userAge >= 0 && userAge <=5 ) {
            System.out.println("Baby");
        } else if (userAge >=6 && userAge <=11) {
            System.out.println("Kid");
        } else if (userAge >=12 && userAge <=17){
            System.out.println("Teen");
        } else if (userAge >18) {
            System.out.println("Adult");
        } else {
            System.out.println("Invalid age number");
        } */
        
        switch ((userAge >=0 && userAge <=5) ? 0 :
                (userAge >=6 && userAge <=11) ? 1:
                (userAge >=12 && userAge <=17) ? 2:
                (userAge >=18) ? 3: 4) {
            case 0:
                  System.out.println("Baby");
                  break;
            case 1:
                System.out.println("Kid");
                break;
            case 2:    
                System.out.println("Teen");
                break;
            case 3:   
                 System.out.println("Adult");
                 break;
            case 4:
                System.out.println("Invalid age number");
                break;
                
        }
        
        
    }
    
}
