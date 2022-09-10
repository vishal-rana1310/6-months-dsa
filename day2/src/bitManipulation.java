import java.util.*;
public class bitManipulation {
    //there are four operations in bit manipulation GET,SET,CLEAR,UPDATE

    //get bit function
    public static void getBit(){
        int n = 5; //0101
        int pos = 2;
        int bitMask = 1<<pos;
        if((bitMask & n) == 0){
            System.out.println("Bit was zero");
        } else {
            System.out.println("Bit was one");
        }
    }

    //set bit function
    public static void setBit(){
        int n = 5; //0101
        int pos = 1;
        int bitMask = 1<<pos;
        int newNumber = bitMask | n;
        System.out.println("after set bit "+newNumber);
    }

    //clear bit function
    public static void clearBit(){
        int n = 5; //0101
        int pos = 0;
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);
        int newNumber = notBitMask & n;
        System.out.println("after clear bit "+newNumber);
    }
    public static void updateBit(){
        int n = 5; //0101
        int pos = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose from 1 or 0: ");
        int operation = sc.nextInt();
        int bitMask = 1<<pos;
        if(operation == 1){
            int newNumber = bitMask | n;
            System.out.println("new number is "+newNumber);
        }else if(operation == 0){
            int notBitMask = ~(bitMask);
            int newNumber = notBitMask & n;
            System.out.println("new number is "+newNumber);
        }

    }

    //update bit function
    public static void main(String[] args){
        System.out.println("Bit Manipulation >>>>>");
        getBit();
        setBit();
        clearBit();
        updateBit();
    }
}
