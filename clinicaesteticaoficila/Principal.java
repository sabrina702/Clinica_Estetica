/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaesteticaoficila;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Principal {
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         List<Consulta> listaConsulta = new ArrayList<>();
        
        Atendente atendente = new Atendente("Bruna",1200);
        System.out.println("Insira uma senha: ");
        atendente.setSenha((int) entrada.nextDouble());
        if(atendente.autentica(456)==true){
        Cliente cliente1  = new Cliente("João Alves");
        Funcionario funcionario1 = new Esteticista("Nivaldo",2500);
        Funcionario faxineira = new Funcionario("Maria",1200);
        Categoria categoria1 = new Categoria("Pele");
        Categoria categoria2 = new Categoria("Rosto");
        Procedimento procedimento1 = new Procedimento(categoria1);
        procedimento1.setNomeProcedimento("Botox");
        Procedimento procedimento2 = new Procedimento(categoria2);
        procedimento2.setNomeProcedimento("Rinoplastia");
        Consulta consulta1 = new Consulta(350.0, cliente1, funcionario1, procedimento1);
        Consulta consulta2 = new Consulta(2500.0, cliente1, funcionario1, procedimento2);
        funcionario1.bonifica(50);
        funcionario1.mostraSalario(funcionario1);
        faxineira.bonifica(50);
        faxineira.mostraSalario(faxineira);

        listaConsulta.add(consulta1);
        listaConsulta.add(consulta2);
        Consulta.relatorioConsulta(listaConsulta);
        }
   
    }
}
