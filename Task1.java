/*TASK 1
 NUMBER GAME*/
 import java.util.*;
class Task1{
        static  Scanner sc=new Scanner(System.in);
        public static void Guess(){
           Random r=new Random(); 
       int randomno=r.nextInt(100)+1;
       for (int i=0;i<4;i++){
       System.out.println("Guess the number");
       int num=sc.nextInt();
       if(num>randomno){
        System.out.println("Too high");
        if(i==3){
           System.out.println("Sorry!!!\nYour Attempts are over"); 
        }
        else{
            continue;
        }
       }
       else if(num<randomno){
        System.out.println("Too low");
        if(i==3){
           System.out.println("Sorry!!!\nYour Attempts are over"); 
        }
        else{
            continue;
        }
       }
       else{
        System.out.println("Congratulations!!!\nYou got it");
        if(i==0){
         System.out.println("Your Score is 100%");
        }
        else if(i==1){
          System.out.println("Your Score is 75%");
        }
        else if(i==2){
        System.out.println("Your Score is 50%");
        }
        else if(i==3){
        System.out.println("Your Score is 25%");
        }
        else{
            System.out.println("End");
        }
       break;
       }
      
    }
   }
    public static void main(String[] args) {
     
       System.out.println("***NUMBER GUESSING GAME***");
       System.out.println("You have 4 attempts to guess correct number");
       Guess();
       System.out.println("Enter 1 if you want to PLAY AGAIN");
       int a=sc.nextInt();
       if(a==1){
        Guess();
       }
       else{
        System.out.println("***END***");
       }
    }

}