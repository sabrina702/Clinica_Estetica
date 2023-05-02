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
public class Procedimento {
    private String nomeProcedimento;
    Categoria categoria;

    public Procedimento(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
    public String getNomeProcedimento() {
        return nomeProcedimento;
    }

    public void setNomeProcedimento(String nomeProcedimento) {
        this.nomeProcedimento = nomeProcedimento;
    }  
    
}
