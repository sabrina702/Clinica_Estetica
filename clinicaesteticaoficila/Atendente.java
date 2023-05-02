/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaesteticaoficila;

/**
 *
 * @author Lenovo
 */
public class Atendente extends Funcionario{
    private int senha;
    
    public Atendente(String nomeFuncionario, double salario) {
        super(nomeFuncionario, salario);
    }
    
    public boolean autentica(int senha) {
    if (this.senha == senha) {
        System.out.println("Acesso Permitido!");
        return true;
    } else {
        System.out.println("Acesso Negado!");
        return false;
        }
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
}
