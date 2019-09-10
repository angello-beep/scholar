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
public class Persona {
    
    public String nombre;
    public String apellido;
    public String fecha_nacimiento;
    public String tipo_sangre;
    public String nacionalidad;
    public String identificacion;
    public String telefono;
    public String direccion;
    public String correo_electronico;
    public String genero;
    public int año_nacimiento=1998;
    public int año_actual=2019;        

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public String getGenero() {
        return genero;
    }
    
    public void printname(){    
        
        System.out.println(this.nombre + " " + this.apellido);
    } 
    
    public void printfecha() {
        System.out.println("fecha de nacimiento" + this.fecha_nacimiento);
    }
    public void printedad(){
        System.out.println("la edad es" + this.calcEdad ());
    }
    public int calcEdad(){
        
        return año_actual-año_nacimiento;
        
    
      
    }
        
    }   
        


