package EjerciciosComplementariosLevel1;
import java.util.*;

public class ejercicio6{

    static float exponenciar(int a,int b){
        if (b>0){
            return a*exponenciar(a, b-1);
        }else{
            return 1;
        }
    }

    static float exponenciarNegat(float a,float b){
        if (b<0){
            return (1/a)*exponenciarNegat(a, b+1);
        }else{
            return 1;
        }
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese la base: ");
        int num1 = scan.nextInt();
        System.out.println("ingrese el exponente: ");
        int num2 = scan.nextInt();
        if (num2<0){
            System.out.println(num1+" elevado "+num2+" = "+exponenciarNegat(num1, num2));
        }else{
            System.out.println(num1+" elevado "+num2+" = "+exponenciar(num1, num2));
        }
        System.out.println();
        
        scan.close();
        }
    }
