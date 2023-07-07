//Exercicio 1

package application;

import classes.CD;
import classes.DVD;

public class MainMidia {

    public static void main(String[] args) {

        CD cd = new CD();
        DVD dvd = new DVD();
        
        cd.inserirDados();
        cd.printDados();
        dvd.inserirDados();
        dvd.printDados();
    }

}
