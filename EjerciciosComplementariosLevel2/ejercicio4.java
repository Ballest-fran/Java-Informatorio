package EjerciciosComplementariosLevel2;
import java.util.*;

public class ejercicio4{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<String> alumnos=new ArrayList<>();
        for(int i=0;i<12;i++){
            System.out.println("#ingrese el nombre del alumno "+(i+1));
            alumnos.add(scan.next());
        }
        System.out.println("alumnos ingresados: "+alumnos);
        scan.close();
        List<String> curso1 = alumnos.subList(0, 4);
        System.out.println("curso 1 : "+curso1);
        List<String> curso2 = alumnos.subList(4, 8);
        System.out.println("curso 2 : "+curso2);
        List<String> curso3 = alumnos.subList(8, 12);
        System.out.println("curso 3 : "+curso3);
    }
}

