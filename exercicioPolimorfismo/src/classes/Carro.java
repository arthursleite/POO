//Exercicio 2
package classes;

import java.util.Scanner;

public class Carro extends Veiculos {

    private double km;

    public Carro() {
        
    }
    
    public Carro(String n, double p, double k) {
        super(n, p);
        this.km = k;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double k) {
        this.km = k;
    }

    public void insertData() {
        Scanner sc = new Scanner(System.in);
        super.insertDados();
        System.out.println("Qual a quilometragem do seu carro?");
        setKm(sc.nextDouble());
        sc.nextLine();
        sc.close();
    }

    @Override
    public void printDados() {
        super.printDados();

    }
}
