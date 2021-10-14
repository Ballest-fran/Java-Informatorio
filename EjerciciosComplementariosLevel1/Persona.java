package EjerciciosComplementariosLevel1;
public class Persona{
    private String nomYApell;
    public String getnomYApell(){
        return nomYApell;
    }
    public void setnomYApell(String nomYApell){
        this.nomYApell=nomYApell;
    }

    private int edad;
    public int getedad(){
        return edad;
    }
    public void setedad(int edad){
        this.edad=edad;
    }

    private String direc;
    public String getdirec(){
        return direc;
    }
    public void setdirec(String direc){
        this.direc=direc;
    }

    private String ciudad;
    public String getciudad(){
        return ciudad;
    }
    public void setciudad(String ciudad){
        this.ciudad=ciudad;
    }
}