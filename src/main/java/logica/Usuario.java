/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author PC
 */
@Entity
public class Usuario implements Serializable {
    @Id
    int id;
    @Basic
    String nombre;
    @Basic
    String apellido;
    @Basic
    String tipoDeSangre;
    @Basic
    int cargo;
    @Basic
    String email;
    @Basic
    String password;

    public Usuario(int id, String nombre, String apellido, String tipoDeSangre, int cargo, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDeSangre = tipoDeSangre;
        this.cargo = cargo;
        this.email = email;
        this.password = password;
    }
    
    public Usuario(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
