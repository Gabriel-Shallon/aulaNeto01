package aula02;

import javax.swing.JOptionPane;

public class App {
    
public static void main( String[] args){
    Pessoa pessoa1;
    pessoa1 = new Pessoa();


    pessoa1.setNome("Neto");
    JOptionPane.showMessageDialog(null, pessoa1.getNome()); 


}




}
