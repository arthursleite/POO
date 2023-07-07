//Exercicio 1

package classes;

import java.util.Scanner;

public class Midia {

    private int codigo;
    private double preco;
    private String nome;

    public Midia() {

    }

    public Midia(int c, double p, String n) {
        this.codigo = c;
        this.preco = p;
        this.nome = n;
    }

    public String getTipo() {
        return "Tipo de midia: "
                + getClass().getSimpleName();
    }

    public String getDetalhes() {
        return "Codigo: "
                + codigo
                + "\nPreco: "
                + preco
                + "\nNome: "
                + nome;
    }

    public void printDados() {
        System.out.println(getTipo());
        System.out.println(getDetalhes());
    }

    public void inserirDados() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o codigo do produto: ");
        setCodigo(sc.nextInt());
        System.out.println("Digite o preco do produto: ");
        setPreco(sc.nextDouble());
        sc.nextLine();
        System.out.println("Digite o nome do produto: ");
        setNome(sc.nextLine());
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
