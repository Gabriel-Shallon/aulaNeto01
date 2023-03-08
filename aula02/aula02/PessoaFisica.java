package aula02;

import javax.swing.JOptionPane;

class PessoaFisica extends Pessoa{
    protected long cpf;


    PessoaFisica(String nome, String email, long cpf){
        super(nome, email);
        this.cpf = cpf;
    }


    @Override
    public void acao(){
        JOptionPane.showMessageDialog(null, "Ação executada no objeto filho");
    }


}
