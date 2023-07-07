//Exercicio 1

package classes;

import java.util.Scanner;

public class DVD extends Midia {

    private int nFaixas;

    public DVD() {
        
    }
    
    public DVD(int c, double p, String s, int f) {
        super(c, p, s);
        this.nFaixas = f;
    }
    
    @Override
    public String getTipo() {
        return super.getTipo();
    }
    
    @Override
    public String getDetalhes() {
        return super.getDetalhes()
                + "\nNumero de faixas: "
                + nFaixas;
    }
    
    public void setFaixas(int f) {
        setNFaixas(f);
    }
    
    @Override
    public void inserirDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Dados do DVD ---");
        super.inserirDados();
        System.out.println("Digite o numero de faixas do produto: ");
        setNFaixas(sc.nextInt());
    }

    public int getNFaixas() {
        return nFaixas;
    }

    public void setNFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }
}
