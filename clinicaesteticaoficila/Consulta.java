/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaesteticaoficila;

import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Consulta {
    private int idConsulta;
    private double valorConsulta;
    private static int totalIdConsulta;
    
    Cliente objCliente;
    Funcionario objFuncionario;
    Procedimento objProcedimento;

    public Consulta(double valorConsulta,Cliente objCliente, Funcionario objFuncionario, Procedimento objProcedimento) {
        this.valorConsulta = valorConsulta;
        this.objCliente = objCliente;
        this.objFuncionario = objFuncionario;
        this.objProcedimento = objProcedimento;
        
        Consulta.totalIdConsulta = Consulta.totalIdConsulta +1;
        this.idConsulta = Consulta.totalIdConsulta;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public int getTotalIdConsulta() {
        return totalIdConsulta;
    }

    public void setTotalIdConsulta(int totalIdConsulta) {
        this.totalIdConsulta = totalIdConsulta;
    }

    public Cliente getObjCliente() {
        return objCliente;
    }

    public void setObjCliente(Cliente objCliente) {
        this.objCliente = objCliente;
    }

    public Funcionario getObjFuncionario() {
        return objFuncionario;
    }

    public void setObjFuncionario(Funcionario objFuncionario) {
        this.objFuncionario = objFuncionario;
    }

    public Procedimento getObjProcedimento() {
        return objProcedimento;
    }

    public void setObjProcedimento(Procedimento objProcedimento) {
        this.objProcedimento = objProcedimento;
    }
    
      public static void relatorioConsulta(List<Consulta> listaConsulta) {     
        for (Consulta consulta : listaConsulta) {
            System.out.println("Cliente: " + consulta.objCliente.getNomeCliente());
            System.out.println("Funcionario: " + consulta.objFuncionario.getNomeFuncionario());
            System.out.println("Procedimento: " + consulta.objProcedimento.getNomeProcedimento());
            System.out.println("Categoria: "+consulta.objProcedimento.categoria.getNomeCategoria());
            System.out.println("ID: " + consulta.getIdConsulta());
            System.out.println("Valor da consulta/procedimento: " + consulta.getValorConsulta());
            System.out.println("----------------------------------");
            System.out.println("");
        }
    }
    
}
