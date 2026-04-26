/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Usuario;

/**
 *
 * @author PC
 */
public class ControladoraPersistencia {
     UsuarioJpaController usuarioJpaController = new UsuarioJpaController();
    
    public void crearUsuario(Usuario u) {

        try {
            usuarioJpaController.create(u);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Usuario> consultarUsuarios() {
        return usuarioJpaController.findUsuarioEntities();
    }
    
}
