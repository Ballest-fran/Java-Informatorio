//Dada una lista que contiene valores de tipo String, se deberá filtrar todos los valores que NO sean null o vacío ("").
package EjerciciosComplementariosLevel3;
import java.util.ArrayList;
import java.util.List;

public class ejercicio2{
    public static void main(String[] args){
        List<Integer> palabras = List.of(1, 2, 3, 4, 5);
        List<Integer> Salida = new ArrayList<>();
        System.out.println(palabras);
        for(int num = 0; num < palabras.size(); num++){
            if (palabras.get(num)==null){
                System.out.println("elemento nulo");
            }else{
                Salida.add(palabras.get(num)*palabras.get(num));
            }
        }
        System.out.println(Salida);
    }
}