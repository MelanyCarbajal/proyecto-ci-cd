package com.ejemplo.casos.caso1.v2;

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

}