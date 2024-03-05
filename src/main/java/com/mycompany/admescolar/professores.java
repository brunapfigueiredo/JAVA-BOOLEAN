/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.admescolar;

/**
 *
 * @author Admin
 */
public class professores extends pessoas {
    String disciplina;
    String salario;
    boolean estadodeservico;
    
    public professores(String nome) { //construtor
        super(nome);
    }

    //método para verificar o estado de serviço
    public boolean isEstadodeservico() {
        return estadodeservico;
    }

    //método para definir o estado de serviço
    public void setEstadodeservico(boolean estadodeservico) {
        this.estadodeservico = estadodeservico;
    }

  
    //método que retorna o estado de serviço
    public String emservico() {
        if(this.estadodeservico) {
            return "DE ATESTADO";
        }
        else {
            return "EM SERVIÇO";
        }
    }
}
