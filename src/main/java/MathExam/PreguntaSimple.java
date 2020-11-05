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
public class PreguntaSimple extends Pregunta {

    public PreguntaSimple(int operacion) {
        super(operacion);
        generarPregunta();
    }
    
    @Override
    void generarPregunta(){
        
        Random r = new Random();
        int numeroA = r.nextInt(100);
        int numeroB = r.nextInt(100);
        
        switch(operacion) {
            case 0:
                // esta es la suma
                enunciado = numeroA + " + " + numeroB + " = ";
                respuestaCorrecta = numeroA + numeroB;
                break;
            case 1:
                //esta es la resta
                enunciado = numeroA + " - " + numeroB + " = ";
                respuestaCorrecta = numeroA - numeroB;
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
