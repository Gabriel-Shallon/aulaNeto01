
package aula02;



public abstract class Pessoa{


protected String nome;
protected String email;





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



public abstract void acao();

}

