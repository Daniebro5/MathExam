/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathExam;

import java.util.Random;

/**
 *
 * @author dannibrito
 */
public abstract class Pregunta {
    
    int operacion;
    String enunciado;
    double respuestaCorrecta;
    double respuestaEstudiante;
    boolean isAcertada;

    public Pregunta(int operacion) {
        this.operacion = operacion;
    }

    public void setRespuestaEstudiante(double respuestaEstudiante) {
        this.respuestaEstudiante = respuestaEstudiante;
        
        if(respuestaEstudiante == respuestaCorrecta) {
            isAcertada = true;
        } else {
            isAcertada = false;
        }
        
    }
    
    
    
    abstract void generarPregunta();
}
