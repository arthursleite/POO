//Exercicio 2
package classes;

import java.util.Scanner;

public class Moto extends Veiculos {

    private int ano;

    public Moto() {

    }

    public Moto(String n, double p, int a) {
        super(n, p);
        this.ano = a;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void insertData() {
        Scanner sc = new Scanner(System.in);
        super.insertDados();
        System.out.println("Qual o ano da sua moto?");
        setAno(sc.nextInt());
        sc.nextLine();
        sc.close();
    }

    @Override
    public void printDados() {
        super.printDados();

    }
}
