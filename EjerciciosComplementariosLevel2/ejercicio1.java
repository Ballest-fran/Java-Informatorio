package EjerciciosComplementariosLevel2;
import java.util.*;

public class ejercicio1{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<String> ciudades=new ArrayList<>();
        String ban;
        while (true){
            System.out.println("Si desea ingresar una nueva ciudad en el ranking precione s, de lo contrario PRECIONE OTRA TECLA");
            ban=scan.next();
            if(ban.charAt(0)=='s'){
                ciudades.add(scan.next());
            }else{
                break;
            }
        }
        scan.close();
        for(int i=0;i<(ciudades.size());i++){
            System.out.println("#"+(i+1)+" - "+ciudades.get(i));
        }
        if (ciudades.size()==0){
            System.out.println("no se ingreso ciudades");
        }
    }
}

