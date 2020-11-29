/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author Miguel
 */
public interface InstrumentoMusical {
    //por defecto todos los metodos son public y abstract
    void tocar();
    void afinar();
    String tipoInstrumento();
    
}
