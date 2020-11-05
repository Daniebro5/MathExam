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
public class PreguntaVF extends Pregunta {

    public PreguntaVF(int operacion) {
        super(operacion);
    }
    
    @Override
    void generarPregunta() {
        Random r = new Random();
        int numeroA = r.nextInt();
        int numeroB = r.nextInt();
        
        
        
        int verdadera = r.nextInt(2);
        
        switch(operacion) {
            case 0:
                // esta es la suma
                
                if(verdadera == 1) {
                    
                    enunciado = numeroA + " + " + numeroB + " = " + respuestaVerdadera;
                    // 1 significa verdadero en estas preguntas
                    respuestaCorrecta = verdadera;
                } else {
                    enunciado = numeroA + " + " + numeroB + " = " + respuestaFalsa;
                    // 1 significa verdadero en estas preguntas
                    respuestaCorrecta = verdadera;
                }
                
                
                break;
            case 1:
                //esta es la resta
                if(verdadera == 1) {
                    enunciado = numeroA + " - " + numeroB + " = " + respuestaVerdadera;
                    // 1 significa verdadero en estas preguntas
                    respuestaCorrecta = verdadera;
                } else {
                    enunciado = numeroA + " - " + numeroB + " = " + respuestaFalsa;
                    // 1 significa verdadero en estas preguntas
                    respuestaCorrecta = verdadera;
                }
                break;
            case 2:
                //esta es la multiplicacion
                enunciado = numeroA + " * " + numeroB + " = ";
                respuestaCorrecta = numeroA * numeroB;
                break;
            case 3:
                //esta es la division
                enunciado = numeroA + " / " + numeroB + " = ";
                respuestaCorrecta = numeroA / numeroB;
                break;
            default:
                break; 
        }
    }
    
}
