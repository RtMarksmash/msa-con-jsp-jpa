/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import Persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author PC
 */
public class Controladora {
     ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
    
    public void crearUsuario(Usuario u){
        
        controladoraPersistencia.crearUsuario(u);
    }
    
    public List<Usuario> consultarUsuarios(){
        
       return controladoraPersistencia.consultarUsuarios();     
    }
    
}
