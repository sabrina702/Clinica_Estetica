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
public class Esteticista extends Funcionario{
    
    public Esteticista(String nomeFuncionario, double salario) {
        super(nomeFuncionario, salario);
    }
    @Override
    public void bonifica(double valor){ // método
        this.salario += valor + (valor * 0.2);        
        System.out.println("Você recebeu bonificação!");
    } 
}
