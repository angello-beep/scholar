 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholar;

/**
 *
 * @author estudiante
 */
public class Scholar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Empleado empleado1= new Empleado(); 
         
        empleado1.nombre= "angello";
        empleado1.apellido= "maury";
        //System.out.println("el empleado se llama" + empleado1.nombre + empleado1.apellido);
        empleado1.printname();
        Estudiante estudiante1= new Estudiante();
        
        estudiante1.nombre= "angello";
        estudiante1.apellido= "maury";
        //System.out.println("el estudiante se llama" + estudiante1.nombre);
        
        
        
        
     
    }
    
}
