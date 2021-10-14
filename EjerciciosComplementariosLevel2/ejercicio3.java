package EjerciciosComplementariosLevel2;
import java.util.*;

public class ejercicio3{

    public static void main(String[] args){
        ArrayList<String> cartas = new ArrayList<>();
        for(int i=0;i<10;i++){
            cartas.add(String.valueOf((i+1)));
        }
        cartas.add("J");
        cartas.add("Q");
        cartas.add("K");
        System.out.println(cartas);
        Comparator<String> comparador = Collections.reverseOrder();
        Collections.sort(cartas, comparador);
        System.out.println(cartas);
        Collections.shuffle(cartas);
        System.out.println(cartas);
    }
}
