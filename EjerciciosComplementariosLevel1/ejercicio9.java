package EjerciciosComplementariosLevel1;
import java.util.*;

public class ejercicio9{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una plabara,frase o texto:");
        String texto = scan.nextLine();
        System.out.println("Ingrese simbolo a contar:");
        String cart = scan.nextLine();
        scan.close();
        int resul=0;
        for(int i=0;i<texto.length();i++) {
            if(texto.charAt(i)==cart.charAt(0)){
                resul++;
            }
        }
        System.out.println("--------> "+resul);
        }
}
