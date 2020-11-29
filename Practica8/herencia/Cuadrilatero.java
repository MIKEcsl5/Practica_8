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
public class Cuadrilatero extends Poligono{
    private int alpha, beta;
    private float altura, base, a, b;

    public Cuadrilatero() {
    }

    public Cuadrilatero(int alpha, int beta, float altura, float base, float a, float b) {
        this.alpha = alpha;
        this.beta = beta;
        this.altura = altura;
        this.base = base;
        this.a = a;
        this.b = b;
    }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    public int getBeta() {
        return beta;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Cuadrilatero{" + "alpha=" + alpha + ", beta=" + beta + ", altura=" + altura + ", base=" + base + ", a=" + a + ", b=" + b + '}';
    }
    
}
