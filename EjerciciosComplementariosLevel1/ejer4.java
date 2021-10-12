package ejerciciosClases;
import java.util.*;

public class ejer4{

    static int factorial(int n){
        if (n>1){
            return n*factorial(n-1);
        }else{
            return 1;
        }
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(factorial(num));
        scan.close();
        }
    }