package com.ejemplo.casos.caso1.v1;

public class MainApp {
    
    public static void main(String[] args) {
        System.out.println("App corriendo!");

        ProductoService producto = new ProductoService();

        // Llamada correcta con 3 parámetros
        producto.mostrarPrenda("Camisa", "M", 49.99);
    }
}