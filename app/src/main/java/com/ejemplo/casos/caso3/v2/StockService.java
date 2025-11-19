package com.ejemplo.casos.caso3.v2;
import java.util.HashMap;
public class StockService {
      private HashMap<String, Integer> stock;

    public StockService() {
        stock = new HashMap<>();
    }

    // Agregar stock de prenda con validación
    public boolean agregarStock(String prenda, int cantidad) {
        if(prenda == null || prenda.isEmpty()) {
            System.out.println("Error: prenda inválida");
            return false;
        }
        if(cantidad < 0) {
            System.out.println("Error: cantidad inválida");
            return false;
        }
        stock.put(prenda, cantidad);
        System.out.println("Stock agregado: " + prenda + " - " + cantidad);
        return true;
    }

    // Ver stock
    public void verStock() {
        System.out.println("=== Stock Actual ===");
        for(String prenda : stock.keySet()) {
            System.out.println(prenda + " - " + stock.get(prenda));
        }
    }

}
