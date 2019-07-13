package Entitati;

public class Copil extends Om{


//    overload

    public void afisareInfoCopil (String nume, String prenume){
        System.out.println("Copilul nostru are numele de " + nume);
        System.out.println("Copilul nostru are prenumele de " + prenume);
    }

    public void afisareInfoCopil (String nume, String prenume, int varsta){
        System.out.println("Copilul nostru are numele de " + nume);
        System.out.println("Copilul nostru are prenumele de " + prenume);
        System.out.println("Copilul nostru are inaltimea de " + varsta);
    }

    public void afisareInfoCopil (){
        System.out.println("Copilul nostru are numele de " + nume);
        System.out.println("Copilul nostru are prenumele de " + this.prenume);
        System.out.println("Copilul nostru are inaltimea de " + getVarsta());
    }
}
