/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import classes.EGenero;

/**
 *
 * @author Leandro
 */
public class GeneroDados {
    public static EGenero obterTipo(String tipo){
        for (EGenero t :EGenero.values()) {
            if(t.getText().equals(tipo)){
                return t;
            }
        }
        return null;
    }
}
