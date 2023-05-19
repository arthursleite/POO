package applications;

import classes.Pessoa;
import classes.Endereco;
import classes.Telefone;

public class Main {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Endereco e1 = new Endereco();
        Telefone t1 = new Telefone();
        Telefone t2 = new Telefone();
        Telefone[] tArray = new Telefone[2];

        //dados do objeto pessoa
        p1.setNome("Arthur");

        //dados do endereco
        e1.setLogradouro("Rua das Flores");
        e1.setNumero(25);

        //associar o endereco ao objeto Maria
        p1.setEnd(e1);

        //associar o telefone ao objeto Maria
        tArray[0] = t1;
        tArray[1] = t2;
        p1.setTel(tArray);

        //dados telefone cel
        t1.setDdd("61");
        t1.setFone("99865-4578");

        //dados telefone fixo
        t2.setDdd("64");
        t2.setFone("98754-3524");

        System.out.println("Nome: " + p1.getNome()
                + "\nEndereco: " + p1.getEnd().getLogradouro()
                + " " + p1.getEnd().getNumero());

        for (int i = 0; i < tArray.length; i++) {
            System.out.println("Telefones: " + tArray[i].getFone()
                    + "\nDDD " + (i + 1) + ": " + tArray[i].getDdd());
        }
        
        for (Telefone t : p1.getTel()) {
            System.out.println("Telefones: " + t.getFone()
                    + "\nDDD: " + t.getDdd());
        }
    }

}
