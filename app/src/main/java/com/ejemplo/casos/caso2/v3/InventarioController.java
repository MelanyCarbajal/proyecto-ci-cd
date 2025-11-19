package com.ejemplo.casos.caso2.v3;
import java.util.HashMap;
public class InventarioController {
    private HashMap<String, Integer> inventario;

    public InventarioController() {
        inventario = new HashMap<>();
    }

    // Agregar prenda al inventario con validación
    public boolean agregarPrenda(String nombre, int cantidad) {
        if(nombre == null || nombre.isEmpty()) {
            System.out.println("Error: nombre inválido");
            return false;
        }
        if(cantidad <= 0) {
            System.out.println("Error: cantidad inválida");
            return false;
        }
        inventario.put(nombre, cantidad);
        System.out.println("Agregado: " + nombre + " - Cantidad: " + cantidad);
        return true;
    }

    // Ver inventario
    public void verInventario() {
        System.out.println("=== Inventario ===");
        for(String prenda : inventario.keySet()) {
            System.out.println(prenda + " - " + inventario.get(prenda));
        }
    }

    // Pruebas simuladas 
    public void pruebaInventario() {
        System.out.println("=== Pruebas Inventario ===");
        agregarPrenda("Camiseta", 10);
        agregarPrenda("Pantalón", -5);    // inválido
        agregarPrenda("", 3);             // inválido
        agregarPrenda("Chaqueta", 5);
        verInventario();
        System.out.println("=== Fin de pruebas ===");
    }
}
