import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = sc.nextInt();
        for(int i = 1; i <= number; i++){
            if(i % 3 == 0 && i % 5 == 0)
                System.out.println("fizzbuzz");
            else if(i % 3 == 0)
                System.out.println("fizz");
            else if(i % 5 == 0)
                System.out.println("buzz");
            else{
                System.out.println(i);
            }
        }
    }
}
