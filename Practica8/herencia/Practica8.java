/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Miguel
 */
public class Practica8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("************** Actividad 1 *************");
        Poligono poligono1 = new Poligono();
        System.out.println("poligono: "+poligono1);
        /*las clases Base pueden comportarse como sus subclases*/
        
        Object objeto1 = new Object();
        System.out.println("objeto: "+objeto1);
        
        objeto1 = poligono1;
        System.out.println("objecto como poligono: "+objeto1);
        
        /* Otras formas de instanciar
        Object objeto2 = new Poligono();
        System.out.println("objeto2 "+objeto2);
        Object objeto3 = poligono;
        System.out.println("objeto3 "+objeto3);
        */
        
        System.out.println("************** Actividad 2 *************");
        poligono1 = new Triangulo();
        System.out.println(poligono1);
        selectorPoligonos(poligono1);
                
        poligono1 = new Cuadrilatero();
        System.out.println(poligono1);
        selectorPoligonos(poligono1);
        
        poligono1 = new Poligono();
        System.out.println(poligono1);
        selectorPoligonos(poligono1);
        
    }   
    public static void selectorPoligonos(Poligono poligono){
        if (poligono instanceof Triangulo){
            System.out.println("El objeto es un triangulo");
        }else if (poligono instanceof Cuadrilatero){
            System.out.println("El objeto es un cuadrilatero");
        }else if (poligono instanceof Poligono){
            System.out.println("El objeto es un Poligono");
        }else{
            System.out.println("El objeto es otra figura");
        }
    }
}
