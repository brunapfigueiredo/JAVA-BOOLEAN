/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.admescolar;

/**
 *
 * @author Admin
 */
public class coordenadores extends pessoas {
    String curso;
    static String escoladetrabalho = "Etec Zona Leste";
    boolean entregarelatorio;
    
    public coordenadores (String nome) { //construtor
        super(nome);    
}
    //método para verificar o estado da entrega de relatorio
    public boolean isEntregarelatorio() {
        return entregarelatorio;
    }

    //método para definir o estado da entrega de relatorio
    public void setEntregarelatorio(boolean entregarelatorio) {
        this.entregarelatorio = entregarelatorio;
    }
    
    //método que retorna o estado dos relatórios
    public String relatorios() {
        if(this.entregarelatorio) {
            return "ATRASADO";
        }
        else {
            return "COMPLETO";
        }
    }
}
