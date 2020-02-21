/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JComboBox;

/**
 * enumerador
 * @author Leandro
 */
public enum EGenero {
    ACAO("Ação"),
    TERROR("Terror"),
    DRAMA("Drama"),
    COMEDIA("Comédia");

    private String tipo;
    
    private EGenero(String tipo){
        this.tipo = tipo;
}
    public String getText(){
        return this.tipo;
}
}
