package com.ejemplo.casos.caso2.v2;
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
}
