package com.ejemplo.casos.caso1.v3;

public class ProductoService {
      public void mostrarPrenda(String nombre, String talla, double precio) {
        System.out.println("Prenda: " + nombre);
        System.out.println("Talla: " + talla);
        System.out.println("Precio: $" + precio);
    }

    // Validar que la prenda tenga datos correctos
    public boolean validarPrenda(String nombre, String talla, double precio, int stock) {
        if(nombre == null || nombre.isEmpty()) {
            System.out.println("Error: nombre inválido");
            return false;
        }
        if(talla == null || talla.isEmpty()) {
            System.out.println("Error: talla inválida");
            return false;
        }
        if(precio <= 0) {
            System.out.println("Error: precio inválido");
            return false;
        }
        if(stock < 0) {
            System.out.println("Error: stock inválido");
            return false;
        }
        System.out.println("Prenda válida");
        return true;
    }

    // Pruebas simuladas
    public void pruebaValidacion() {
        System.out.println("=== Prueba 1 ===");
        validarPrenda("Camiseta", "M", 20.0, 10);  // válida
        validarPrenda("", "L", 15.0, 5);           // nombre inválido
        validarPrenda("Pantalón", "", 25.0, 2);   // talla inválida
        validarPrenda("Sudadera", "S", -5.0, 3);  // precio inválido
        validarPrenda("Chaqueta", "L", 50.0, -1); // stock inválido
        System.out.println("=== Fin de pruebas ===");
    }
}
