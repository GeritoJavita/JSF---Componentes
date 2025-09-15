package com.example.modelo;

public class Empleado {
    private String nombre;
    private String identificacion;
    private double salarioBase;
    private int diasTrabajados;

    private static final double SMMLV = 1300000;
    private static final double AUXILIO_TRANSPORTE = 162000;

    public Empleado() {
    }

    public Empleado(String nombre, String identificacion, double salarioBase, int diasTrabajados) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.salarioBase = salarioBase;
        this.diasTrabajados = diasTrabajados;
    }

    public double calcularSalario() {
        return (salarioBase / 30) * diasTrabajados;
    }

    public double calcularSalud() {
        return calcularSalario() * 0.04;
    }

    public double calcularPension() {
        return calcularSalario() * 0.04;
    }

    public double calcularAuxilio() {
        return salarioBase <= (SMMLV * 2) ? AUXILIO_TRANSPORTE : 0;
    }

    public double calcularNeto() {
        return calcularSalario() - calcularSalud() - calcularPension() + calcularAuxilio();
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getIdentificacion() { return identificacion; }
    public void setIdentificacion(String identificacion) { this.identificacion = identificacion; }

    public double getSalarioBase() { return salarioBase; }
    public void setSalarioBase(double salarioBase) { this.salarioBase = salarioBase; }

    public int getDiasTrabajados() { return diasTrabajados; }
    public void setDiasTrabajados(int diasTrabajados) { this.diasTrabajados = diasTrabajados; }
}
