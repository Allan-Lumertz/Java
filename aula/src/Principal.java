import javax.swing.JOptionPane;
public class Principal {

    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = JOptionPane.showInputDialog("Digite seu nome: ");
        pessoa.email = JOptionPane.showInputDialog("Digite seu email: ");
        Arquivo arquivo = new Arquivo();
        
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("se quiser o nome digite 1, se quiser os 2 digite 5!"));
        
        switch(opcao){
            case 1:
                arquivo.escreverArquivo(pessoa.nome);
                System.out.println(pessoa.nome);
            break;
            case 5:
                arquivo.escreverArquivo(pessoa.nome, pessoa.email);
                System.out.println(pessoa.nome + "  " + pessoa.email);
        }
        
    }
    
}
