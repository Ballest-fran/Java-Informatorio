package EjerciciosComplementariosLevel2;
import java.util.*;

public class ejercicio2{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        LinkedList<Integer> numeros = new LinkedList<>();
        for(int i=0;i<5;i++){
            System.out.println("agregar elemento 'normalmente':");
            numeros.add(scan.nextInt());
        }
        System.out.println("Tamaño del arrglo: "+numeros.size());
        System.out.println("agregar elemento al principio del arrglo:");
        numeros.addFirst(scan.nextInt());
        System.out.println("agregar elemento al final del arrglo:");
        numeros.addLast(scan.nextInt());
        System.out.println("Tamaño del arrglo: "+numeros.size());
        System.out.println(numeros);
        scan.close();
    }
}
