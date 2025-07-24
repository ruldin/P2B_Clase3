package com.negocio.models;

// ERROR 1: Atributos públicos (Mala práctica de encapsulamiento)
public class Producto {
    public int id;
    public String nombre;
    public double precio;
    public int stock;

    // ERROR 2: Constructor sin validaciones
    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock; // No valida si el stock es negativo
    }

    // ERROR 3: Método que permite stock negativo
    public void reducirStock(int cantidad) {
        this.stock = this.stock - cantidad; // No verifica si hay suficiente stock
    }

    // ERROR 4: Método con lógica incorrecta
    public boolean hayStock(int cantidad) {
        return stock > cantidad; // Debería ser >= para permitir exactamente la cantidad
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
