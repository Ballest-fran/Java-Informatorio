package EjerciciosComplementariosLevel1;
import java.util.*;

public class ejercicio5{
    static int multiPorRecursividad(int a,int b){
        if (a>0){
            return b+multiPorRecursividad(a-1, b);
        }else{
            return 0;
        }
    }

    static int multip (int a,int b){
        int r=0;
        boolean ban=false;
        if (a<0){
            a=a*(-1);
            ban=true;
        }
        for(int i=0;i<a;i++){
            r=r+b;
        }
        if (ban){
            return r*(-1);
        }
        return r;
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese dos numeros para multiplicar: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Resultado ---> "+num1+" * "+num2+" = "+multip(num1, num2));
        System.out.println("Resultado, funcion recursiva ---> "+multiPorRecursividad(num1, num2));
        scan.close();
        }
    }
