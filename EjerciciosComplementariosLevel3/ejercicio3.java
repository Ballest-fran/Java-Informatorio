//Se dispone de una lista de Strings, de la cual saber la cantidad de valores que comiencen 
//  con la letra B (tanto mayúscula como minúscula, en ese caso decimos que será ignoreCase).
package EjerciciosComplementariosLevel3;
import java.util.List;

public class ejercicio3{
    public static void main(String[] args){
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        System.out.println(palabras);
        Integer salida=0;
        for(int num = 0; num < palabras.size(); num++){
            if (palabras.get(num).charAt(0)=='B' || palabras.get(num).charAt(0)=='b'){
                salida++;
            }
        }
        System.out.println("La cantidad palabras que comienzan con 'b' y 'B' son: ");
        System.out.println(salida);
    }
}