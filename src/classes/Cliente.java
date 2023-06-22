package classes;

public class Cliente extends Usuario {

    private String tipoCliente;

    public Cliente() {
    }

    public Cliente(String nome, String endereco, String telefone, String cpf, String email, String tipoCliente) {
        super(nome, endereco, telefone, cpf, email);
        this.tipoCliente = tipoCliente;
    }
    
    public void obterTotal() {
        
    }
    
    public void adicionarCarrinho() {
        
    }
    
    public void listarProduto() {
        
    }
    
    public void escolherProduto() {
        
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    
    
}
