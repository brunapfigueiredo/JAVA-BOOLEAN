/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.admescolar;

/**
 *
 * @author Admin
 */
public class admescolar { //abstração
    
    public static void main (String args[]) {
        alunos aluno1 = new alunos("Bruna Pedroso"); //criação da instancia
        alunos aluno2 = new alunos("Isabella Kojima"); //<--nome exigido pelo construtor
        alunos aluno3 = new alunos("Julia Vioto");
        alunos aluno4 = new alunos("Sophia Chicarelli");
        alunos aluno5 = new alunos("Breno Alves");
        
        //determinando quais alunos trancaram o curso.
        aluno3.setCursotrancado(true);
        aluno5.setCursotrancado(true);
        
        System.out.println("Estado das matrículas:");
        System.out.println("Estado da matrícula de "+aluno1.nome+": "+aluno1.matriculativa());
        System.out.println("Estado da matrícula de "+aluno2.nome+": "+aluno2.matriculativa());
        System.out.println("Estado da matrícula de "+aluno3.nome+": "+aluno3.matriculativa());
        System.out.println("Estado da matrícula de "+aluno4.nome+": "+aluno4.matriculativa());
        System.out.println("Estado da matrícula de "+aluno5.nome+": "+aluno5.matriculativa()+"\n");
        
        
        //criação dos professores       
        professores professor1 = new professores("Wagner");
        professores professor2 = new professores("Ediney");
        professores professor3 = new professores("Colevati");
        professores professor4 = new professores("Paulo");
        
        //determinando qual professor está fora de serviço
        professor3.setEstadodeservico(true);
        
        System.out.println("Estado de serviço:");
        System.out.println("Estado de serviço de "+professor1.nome+": "+professor1.emservico());
        System.out.println("Estado de serviço de "+professor2.nome+": "+professor2.emservico());
        System.out.println("Estado de serviço de "+professor3.nome+": "+professor3.emservico());
        System.out.println("Estado de serviço de "+professor4.nome+": "+professor4.emservico()+"\n");
        
        //criação dos coordenadores
        coordenadores coord1 = new coordenadores("Ediney");
        coordenadores coord2 = new coordenadores("Luciano");
        coordenadores coord3 = new coordenadores("Marcelo");
        
        //determinando qual coordenador atrasou a entrega de relatório
        coord2.setEntregarelatorio(true);
        
        System.out.println("Estado das entregas de relatórios");
        System.out.println("Estado da entrega de relatório "+coord1.nome+": "+coord1.relatorios());
        System.out.println("Estado da entrega de relatório "+coord2.nome+": "+coord2.relatorios());
        System.out.println("Estado da entrega de relatório "+coord3.nome+": "+coord3.relatorios()+"\n");
        
        
        
    }
}
