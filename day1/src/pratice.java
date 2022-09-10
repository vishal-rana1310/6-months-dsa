import java.util.*;

public class pratice {
    public static void main(String[] args){
        MaxCommonDivisor obj = new MaxCommonDivisor();
        obj.getFibonacci();
    }
}

class MaxCommonDivisor{
    void getMaxComDivisor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int secondNumber = sc.nextInt();

        int min = Math.min(firstNumber, secondNumber);
        while (min>0){
            if(firstNumber % min == 0 && secondNumber % min == 0){
                break;
            }
            min--;
        }
        System.out.println("Highest common factor is: "+ min);
    }

    void getFibonacci(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int terms = sc.nextInt();
        int fibonacci [] = new int [terms];
        for (int i = 0; i<terms;i++){
            if(i>1){
                fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            }else {
                fibonacci[i] = i;
            }

        }
        for (int i=0;i<fibonacci.length;i++){
            System.out.print(fibonacci[i] + " ");
        }
    }
}

// 7 =>  0 1 1 2 3 5 8