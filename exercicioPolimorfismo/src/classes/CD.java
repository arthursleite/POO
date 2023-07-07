//Exercicio 1

package classes;

import java.util.Scanner;

public class CD extends Midia {

    private int nMusicas;

    public CD() {

    }

    public CD(int c, double p, String s, int m) {
        super(c, p, s);
        this.nMusicas = m;
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }
    
    @Override
    public String getDetalhes() {
        return super.getDetalhes()
                + "\nNumero de musicas: "
                + nMusicas;
    }
    
    public void setMusica(int m) {
        setNMusicas(m);
    }
    
    @Override
    public void inserirDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Dados do CD ---");
        super.inserirDados();
        System.out.println("Digite o numero de musicas do produto: ");
        setNMusicas(sc.nextInt());
    }

    public int getNMusicas() {
        return nMusicas;
    }

    public void setNMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }
    
    
}
