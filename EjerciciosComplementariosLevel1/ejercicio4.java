package EjerciciosComplementariosLevel1;
import java.util.*;

public class ejercicio4{

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
        System.out.println("El factorial de "+num+" es: "+factorial(num));
        scan.close();
        }
    }