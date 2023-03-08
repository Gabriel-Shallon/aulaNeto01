package aula02;

import javax.swing.JOptionPane;

public class App {
     public static void main(String[] args){

            PessoaFisica pessoa1 = new PessoaFisica("Neto", "neto@", 7363);
            JOptionPane.showMessageDialog(null, pessoa1.nome+pessoa1.email+pessoa1.cpf);
            
        }

}
