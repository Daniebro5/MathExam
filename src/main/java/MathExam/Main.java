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
        
        Examen examen = new Examen(2);
        examen.llenarExamen();
        
        Estudiante[] estudiantes;
        estudiantes = new Estudiante[2];
        
        int promedio = 0;
        
        for(Estudiante est: estudiantes) {
            est = new Estudiante("carlos", examen);
            System.out.println(est.notaFinal);
            promedio += est.notaFinal;
        }
        
        promedio = promedio / 2;
        
        System.out.println(promedio);
        
        
       
    }
    
}
