package Entitati;

public class Om {

    int varsta;
    String nume, prenume;
    double inaltime;

    public void setVarsta (int v){
        this.varsta = v;
    }
    public void setNume (String n){
        this.nume = n;
    }
    public void setPrenume (String p){
        this.prenume = p;
    }
    public void setInaltime(double i){
        this.inaltime = i;
    }
    public void afisareInfoOm (Om om){
        System.out.println("Omul nostru are numele de " + this.nume);
        System.out.println("Omul nostru are prenumele de " + this.prenume);
    }
}