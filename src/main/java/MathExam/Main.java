/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathExam;

import java.io.IOException;
import static java.lang.Double.parseDouble;
import javax.swing.JOptionPane;

/**
 *
 * @author dannibrito
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Examen examen = new Examen(20);
        examen.llenarExamen();
        
        for(Pregunta preg: examen.preguntas) {
            double respuesta = parseDouble(JOptionPane.showInputDialog(null, preg.enunciado, 0));
            preg.setRespuestaEstudiante((double)respuesta);
        }
        
        System.out.println(examen.preguntas[0].respuestaCorrecta);
        System.out.println(examen.preguntas[0].respuestaEstudiante);
        System.out.println(examen.preguntas[0].isAcertada);
    }
    
}
