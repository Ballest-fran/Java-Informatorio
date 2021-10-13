package EjerciciosComplementariosLevel1;
import java.util.*;

public class ejercicio8{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Persona unaPersona= new Persona();
        System.out.println("Ingrese la ciudad de residencia de la persona");
        unaPersona.setciudad(scan.nextLine());
        System.out.println("Ingrese el nombre y apellido de la persona");
        unaPersona.setnomYApell(scan.nextLine());
        System.out.println("Ingrese la direccion de la persona");
        unaPersona.setdirec(scan.nextLine());
        System.out.println("Ingrese la edad de la persona");
        unaPersona.setedad(scan.nextInt());
        scan.close();
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println(
            unaPersona.getciudad()+ " - " +
            unaPersona.getdirec()+ " - " +
            unaPersona.getedad()+ " - " +
            unaPersona.getnomYApell()
        );
        
        }
    }
