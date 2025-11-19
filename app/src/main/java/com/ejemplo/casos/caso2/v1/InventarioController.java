package com.ejemplo.casos.caso2.v1;

import java.util.HashMap;
public class InventarioController {
     private HashMap<String, Integer> inventario;

    public InventarioController() {
        inventario = new HashMap<>();
    }

    // Agregar prenda al inventario
    public void agregarPrenda(String nombre, int cantidad) {
        inventario.put(nombre, cantidad);
        System.out.println("Agregado: " + nombre + " - Cantidad: " + cantidad);
    }

    // Ver inventario
    public void verInventario() {
        System.out.println("=== Inventario ===");
        for(String prenda : inventario.keySet()) {
            System.out.println(prenda + " - " + inventario.get(prenda));
        }
    }

}
