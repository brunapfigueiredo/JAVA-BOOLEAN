/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.admescolar;

/**
 *
 * @author Admin
 */
public class alunos extends pessoas {
    String numdematricula; //criação de atributo
    String serie;
    static int quantdealunos = 5; //criação de atributo estático
    boolean cursotrancado; // criação do atributo lógico
    
    public alunos(String nome) { //construtor
        super(nome);
    }

    //método para verificar se o curso está trancado
    public boolean isCursotrancado() {
        return cursotrancado;
    }
 
    //método para definir o estado do curso
    public void setCursotrancado(boolean cursotrancado) {
        this.cursotrancado = cursotrancado;
    }
    
    //método que retorna o estado da matrícula
    public String matriculativa() {
        //verifica se o curso está trancado
        if(this.cursotrancado) {
            //se o curso estiver trancado, retorna a mensagem abaixo
            return "Curso Trancado";
        }
        else {
            //se o curso não estiver trancado, retorna a mensagem abaixo
            return "Matrícula Ativa";
        }
    }
}
