package ejerciciosClases;
import java.util.*;

public class ejer3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int i=1;

        while (num>=i){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
             }             
            i++;  
            System.out.println();
        }
        scan.close();    
        }
    }
