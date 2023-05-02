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
public class Funcionario {
    private String nomeFuncionario;
    protected double salario;

    public Funcionario(String nomeFuncionario, double salario) {
        this.nomeFuncionario = nomeFuncionario;
        this.salario = salario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void bonifica(double valor){ // método
        this.salario += valor;        
        System.out.println("Você recebeu bonificação!");
    }
    
    public void mostraSalario(Funcionario Funcionario){
        System.out.println("Funcionario: "+nomeFuncionario);
        System.out.println("Salário: "+salario);
        System.out.println("---------------------------------------");
    }
}