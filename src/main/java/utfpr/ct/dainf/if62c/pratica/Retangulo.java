package utfpr.ct.dainf.if62c.pratica;

import java.io.Serializable;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de interface em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Retangulo extends Elipse implements FiguraComLados, Serializable {

    public Retangulo() {
        super();
    }

    public Retangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double getArea() {
        return super.getEixoMaior() * super.getEixoMenor();
        //return getBase() * getAltura();
    }

    @Override
    public double getPerimetro() {
        return (super.getEixoMaior() + super.getEixoMenor()) * 2;
        //return (getBase() + getAltura()) * 2;
    }
    
    @Override
    public double getLadoMenor(){
        return super.getEixoMenor();
    }
    
    @Override
    public double getLadoMaior(){
        return super.getEixoMaior();
    }
}
