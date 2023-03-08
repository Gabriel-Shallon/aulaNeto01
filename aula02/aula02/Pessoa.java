
package aula02;

import javax.swing.JOptionPane;

class Pessoa{

private String nome;
private String email;



public String getNome(){
return nome;
}

public void setNome(String nome){
this.nome = nome;
}

public String getEmail(){
return email;
}

public void setEmail(String email){
this.email = email;
}


Pessoa(String nome, String email){
    this.email = email;
    this.nome = nome;
}
Pessoa(String nome){
    this.nome = nome;
}
Pessoa(){}




public static void main(String[] args){

Pessoa pessoa1  = new Pessoa();
Pessoa pessoa2 = new Pessoa("Neto");
Pessoa pessoa3 = new Pessoa("Neto", "neto@neto");
Pessoa pessoa4  = new Pessoa(JOptionPane.showInputDialog(null, "Insira o quarto nome"));

JOptionPane.showMessageDialog(null, pessoa4.nome);



//mudando o o nome e email usando get
pessoa1.setNome("carlos");
pessoa1.setEmail("carlossolrac123@gmail.com");
pessoa4.setEmail(JOptionPane.showInputDialog(null, "Insira o quarto email"));

JOptionPane.showMessageDialog(null, pessoa1.nome); 
JOptionPane.showMessageDialog(null, pessoa1.getNome()); 



String nome = pessoa3.getNome();
JOptionPane.showMessageDialog(null, nome); 

}


public void acao(){}
}