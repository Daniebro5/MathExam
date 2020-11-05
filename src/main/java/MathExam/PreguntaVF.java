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
        generarPregunta();
    }
    
    @Override
    void generarPregunta() {
        Random r = new Random();
        int numeroA = r.nextInt(100);
        int numeroB = r.nextInt(100);
        
        int respuestaVerdadera;
        int respuestaFalsa;
        
        int verdadera = r.nextInt(2);
        
        switch(operacion) {
            case 0:
                // esta es la suma
                respuestaVerdadera = numeroA + numeroB;
                respuestaFalsa = respuestaVerdadera + r.nextInt();
                
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
                respuestaVerdadera = numeroA - numeroB;
                respuestaFalsa = respuestaVerdadera + r.nextInt();
                
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
                respuestaVerdadera = numeroA * numeroB;
                respuestaFalsa = respuestaVerdadera + r.nextInt();
                
                if(verdadera == 1) {
                    enunciado = numeroA + " * " + numeroB + " = " + respuestaVerdadera;
                    // 1 significa verdadero en estas preguntas
                    respuestaCorrecta = verdadera;
                } else {
                    enunciado = numeroA + " * " + numeroB + " = " + respuestaFalsa;
                    // 1 significa verdadero en estas preguntas
                    respuestaCorrecta = verdadera;
                }
                break;
            case 3:
                respuestaVerdadera = numeroA / numeroB;
                respuestaFalsa = respuestaVerdadera + r.nextInt();
                
                if(verdadera == 1) {
                    enunciado = numeroA + " / " + numeroB + " = " + respuestaVerdadera;
                    // 1 significa verdadero en estas preguntas
                    respuestaCorrecta = verdadera;
                } else {
                    enunciado = numeroA + " / " + numeroB + " = " + respuestaFalsa;
                    // 1 significa verdadero en estas preguntas
                    respuestaCorrecta = verdadera;
                }
                break;
            default:
                break; 
        }
    }
    
}
