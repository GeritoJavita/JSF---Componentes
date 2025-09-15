package com.example;

import java.io.Serializable;

import com.example.modelo.Empleado;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named("nominaBean")  
@SessionScoped         
public class NominaBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Empleado empleado = new Empleado();

    public void limpiar() {
        empleado = new Empleado();
    }

    // Getters & Setters
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

}
