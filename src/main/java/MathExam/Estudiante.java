/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathExam;

import static java.lang.Double.parseDouble;
import javax.swing.JOptionPane;

/**
 *
 * @author dannibrito
 */
public class Estudiante {
    String nombre;
    double notaFinal;

    public Estudiante(String nombre, Examen examen) {
        this.nombre = nombre;
        darExamen(examen);
    }
    
    void darExamen(Examen examen){
        notaFinal = 0;
        System.out.println("\tEst\tCorr\tvalido\n");
        for(Pregunta preg: examen.preguntas) {
            double respuesta = parseDouble(JOptionPane.showInputDialog(null, preg.enunciado, 0));
            preg.setRespuestaEstudiante((double)respuesta);
            
            System.out.println("\t" + preg.respuestaCorrecta + "\t" + preg.respuestaEstudiante + "\t" + preg.isAcertada);
            
            if(preg.isAcertada) {
                notaFinal += 1;
            }
        }
    }
    
    
    
}
