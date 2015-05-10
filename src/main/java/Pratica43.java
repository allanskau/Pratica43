
import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;
import utfpr.ct.dainf.if62c.pratica.Figura;
import utfpr.ct.dainf.if62c.pratica.Quadrado;
import utfpr.ct.dainf.if62c.pratica.Retangulo;
import utfpr.ct.dainf.if62c.pratica.TrianguloEquilatero;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author allan
 */
public class Pratica43 {
    public static final String FORMAT_MSG = "%s de %s = %g";
    public static void main(String[] args) {
        // um vetor de 4 figuras
        Figura[] figuras = new Figura[5];

        // instanciação dos elementos do vetor de figuras
        figuras[0] = new Quadrado(1);
        figuras[1] = new TrianguloEquilatero(2);
        figuras[2] = new Retangulo(3, 4);
        figuras[3] = new Elipse(5, 6);
        figuras[4] = new Circulo(7);

        // processamento das figuras
        for (Figura f : figuras) {
            System.out.println(String.format(FORMAT_MSG, "Área", f, f.getArea()));
            System.out.println(String.format(FORMAT_MSG, "Perímetro", f, f.getPerimetro()));
            
            System.out.println();
        }

        // usando a função somaAreas
        //Retangulo r = new Retangulo(2.5, 5.4);
        //TrianguloEquilatero t = new TrianguloEquilatero(3.45);
        //System.out.println(String.format("Soma das áreas de %s e %s: %g",
            //r, t, somaAreas(r, t)));
    }
}
