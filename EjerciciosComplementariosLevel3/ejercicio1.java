//Dada una lista que contiene valores de tipo String, se deberá filtrar todos los valores que NO sean null o vacío ("").
package EjerciciosComplementariosLevel3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio1{
    public static void main(String[] args){
        List<String> Entrada = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Entrada.add(null);Entrada.add("java");Entrada.add("");Entrada.add(null);
        Entrada.add("hola");Entrada.add("");Entrada.add("profe");Entrada.add("");
        while (true){
            System.out.println("ingrese '1' para ingresar un string, otra tecla para calcular");
            String ban = scan.next();
            if (ban.charAt(0)=='1'){
                Entrada.add(scan.next());
            }else{
                break;
            }
        }
        scan.close();
        System.out.println("El arraylist resultante es: ");
        System.out.println(Entrada);
        System.out.println("removiendo elemntos...");
        List<String> Salida = new ArrayList<>();
        if (Entrada.size() == 0){
            System.out.println("Lista vacia");
        }else{
            for(int num = 0; num < Entrada.size(); num++){
                if (Entrada.get(num)==null || Entrada.get(num)==""){
                    System.out.println("Removemos el elemento: "+(num+1));
                }else{
                    Salida.add(Entrada.get(num));
                }
            }
        }
        System.out.println("la salida resultante es: ");
        System.out.println(Salida);
    }
}