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
public class Examen {
    
    int numeroDePreguntas;
    Pregunta[] preguntas;
    
    int numeroDeEstudiantes;
    Estudiante[] estudiantes;

    public Examen(int numeroDePreguntas) {
        this.numeroDePreguntas = numeroDePreguntas;
        this.preguntas = new Pregunta[numeroDePreguntas];
    }
    
    void llenarExamen(){
        
        for(int index = 0; index < this.numeroDePreguntas; index++){
            Random r = new Random();
            int operacion = r.nextInt(4);
            int tipoDePregunta = r.nextInt(4);

            switch(tipoDePregunta) {
                case 0:
                    preguntas[index] = new PreguntaSimple(operacion);
                    break;
                case 1:
                    preguntas[index] = new PreguntaVF(operacion);
                    break;
                case 2:
//                    preguntas[index] = PreguntaMultiple(operacion);
                    preguntas[index] = new PreguntaSimple(operacion);
                    break;
                case 3:
//                    preguntas[index] = PreguntaOperacion(operacion);
                    preguntas[index] = new PreguntaVF(operacion);
                    break;
                default:
                    break;      
            }
        }
        
        
    }
    
}
