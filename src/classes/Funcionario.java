package classes;

public class Funcionario extends Usuario {

    private String matricula;

    public Funcionario() {
    }

    public Funcionario(String nome, String endereco, String telefone, String cpf, String email, String matricula) {
        super(nome, endereco, telefone, cpf, email);
        this.matricula = matricula;
    }

    public void listarUsuario() {

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
