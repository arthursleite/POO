import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        //instanciacao da classe pra criar o objeto sc
        //[tipo] nomeVariavel = new [tipo](metodo)
        /*Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um nome:");
        String aluno = sc.nextLine();
        System.out.println("Digite a idade:");
        int idade = sc.nextInt();
        System.out.println("Digite um salario:");
        double salario = sc.nextDouble();
        System.out.println("Digite o peso:");
        float peso = sc.nextFloat();
        
        System.out.println("Nome: " + aluno
                            +"\nidade: " + idade
                            +"\nsalario: " + salario
                            +"\npeso: " + peso);*/
        String nome = JOptionPane.showInputDialog("Digite o nome");
        
        String idade = JOptionPane.showInputDialog("Digite a idade");
        int idadeInt = Integer.parseInt(idade);
        
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario"));
        
        JOptionPane.showMessageDialog(null, 
                                        "Nome: " + nome
                                        +"\nIdade: " + idade
                                        +"\nSalario: " + salario);
        
    }
    
}
