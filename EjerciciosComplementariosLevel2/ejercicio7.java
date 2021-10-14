package EjerciciosComplementariosLevel2;
import java.util.*;

public class ejercicio7{
    
    public static String multipoDe(int num){
        if( (num%3==0) && (num%2==0) ){
            return "FizzBuzz";
        }else if(num%2==0){
            return "Fizz";
        }else if(num%3==0){
            return "Buzz";
        }else{
            return String.valueOf(num);
        }

    }

    public static String[] fizzBuzzFuncion(int a,int b){
        String[] salida=new String[b-a];
        int c=0;
        for(int i=a;i<b;i++){
            salida[c]=multipoDe(i);
            c++;
        }
        return salida;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese los datos para ejecutar fizzBuzzFuncion(a,b)");
        System.out.println("ingrese 'a'(recuerde a<b)");
        int datoA=scan.nextInt();
        System.out.println("ingrese 'b'(recuerde a<b)");
        int datoB=scan.nextInt();
        scan.close();
        String[] prureSalida=fizzBuzzFuncion(datoA, datoB);
        System.out.println("Resultado:");
        for(String i:prureSalida){
            System.out.print(i+"   ");
        }
        System.out.println("");
        }
    }
