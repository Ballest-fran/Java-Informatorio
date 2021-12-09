//Se dispone de una lista de Integer, de la cual queremos obtener otra lista aplicando la operación de factorial pero no se desean valores repetidos.
package EjerciciosComplementariosLevel3;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ejercicio4{
    public static int factorial (int numero) {
        if (numero==0)
          return 1;
        else
          return  (numero * factorial(numero-1));
      }
    public static void main(String[] args){
        List<Integer> palabras = List.of(1, 2, 4, 4, 4);
        System.out.println(palabras);
        Set<Integer> salida = new HashSet<>();
        for(int num = 0; num < palabras.size(); num++){
            salida.add(factorial(palabras.get(num)));
        }
        System.out.println("Resultado: ");
        System.out.println(salida);
    }
}