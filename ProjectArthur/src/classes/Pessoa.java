package classes;

public class Pessoa {

    private String nome;
    private Endereco end;
    private Telefone[] tel;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }

    public void setTel(Telefone[] tel) {
        this.tel = tel;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEnd() {
        return end;
    }

    public Telefone[] getTel() {
        return tel;
    }
}
