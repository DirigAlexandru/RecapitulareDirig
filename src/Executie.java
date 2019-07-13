import Entitati.Copil;
import Entitati.Om;

public class Executie {

    public static void main(String[] args) {
        Om x = new Om();

        x.setNume("Popescu");
        x.setPrenume("Ion");
        x.setVarsta(15);
        x.afisareInfoOm(x);

        Copil y = new Copil();
        y.afisareInfoCopil("Ionescu", "Adi");
        y.afisareInfoCopil("Doe", "Jhon", 14);
        y.afisareInfoCopil();


    }
}
