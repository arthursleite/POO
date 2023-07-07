//Exercicio 2
package application;

import classes.Carro;
import classes.Moto;
import java.util.Scanner;

public class MainVeiculos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalPrecoVeiculos = 0.0;

        Moto moto = new Moto();
        Carro carro = new Carro();

        System.out.println("Voce tem um carro ou uma moto? ");
        String resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("moto")) {
            moto.insertData();
            if (moto.getAno() >= 2008) {
                double novoPreco = moto.getPreco() + (moto.getPreco() * 10.0 / 100.0);
                moto.setPreco(novoPreco);
                System.out.println("Novo preco da moto");
            }
            totalPrecoVeiculos += moto.getPreco();
            moto.printDados();
        } else if (resposta.equalsIgnoreCase("carro")) {
            carro.insertData();
            if (carro.getKm() > 100000) {
                double novoPreco = carro.getPreco() - (carro.getPreco() * 8.0 / 100.0);
                carro.setPreco(novoPreco);
                System.out.println("Novo preco do carro");
            }
            totalPrecoVeiculos += carro.getPreco();
            carro.printDados();
        }
        sc.close();
    }

}
