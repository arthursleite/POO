//Exercicio 2
package classes;

import java.util.Scanner;

public class Veiculos {

    private String modelo;
    private double preco;

    public Veiculos() {
        
    }
    
    public Veiculos(String m, double p) {
        this.modelo = m;
        this.preco = p;
    }

    public void insertDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cadastro de carro ---");
        System.out.println("Qual o modelo do seu veiculo? ");
        setModelo(sc.nextLine());
        System.out.println("Qual o preco do seu veiculo? ");
        setPreco(sc.nextDouble());
    }
    
    public void printDados() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Preco: " + getPreco());
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
