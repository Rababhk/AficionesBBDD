/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author damA
 */
public class Cliente {
    private String Profesion;
    private String Edad;
    private int NumHermanos;
    private String Sexo; 
    private boolean PracDeport;
    private String Deporte;
    private int Compra;
    private int Tv;
    private int Cine;

    public Cliente(String Profesion, String Edad, int NumHermanos, String Sexo, boolean PracDeport, String Deporte, int Compra, int Tv, int Cine) {
        this.Profesion = Profesion;
        this.Edad = Edad;
        this.NumHermanos = NumHermanos;
        this.Sexo = Sexo;
        this.PracDeport = PracDeport;
        this.Deporte = Deporte;
        this.Compra = Compra;
        this.Tv = Tv;
        this.Cine = Cine;
    }
    
    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }
    
    public int getNumHermanos() {
        return NumHermanos;
    }

    public void setNumHermanos(int NumHermanos) {
        this.NumHermanos = NumHermanos;
    }

    public boolean isPracDeport() {
        return PracDeport;
    }

    public void setPracDeport(boolean PracDeport) {
        this.PracDeport = PracDeport;
    }

    public String getDeporte() {
        return Deporte;
    }

    public void setDeporte(String Deporte) {
        this.Deporte = Deporte;
    }

    public int getCompra() {
        return Compra;
    }

    public void setCompra(int Compra) {
        this.Compra = Compra;
    }

    public int getTv() {
        return Tv;
    }

    public void setTv(int Tv) {
        this.Tv = Tv;
    }

    public int getCine() {
        return Cine;
    }

    public void setCine(int Cine) {
        this.Cine = Cine;
    }
     public String[] toArrayString(){
        String[] s = new String[9];
        s[0]= Profesion;
        s[1]= Edad;
        s[2]= Integer.toString(NumHermanos);                
        s[3]= Sexo ;
        s[4]=Boolean.toString(PracDeport);
        s[5]=Deporte;
        s[6]=Integer.toString(Compra);
        s[7]=Integer.toString(Tv);
        s[8]=Integer.toString(Cine);
        return s;
    }
}
