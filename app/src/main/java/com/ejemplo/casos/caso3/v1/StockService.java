package com.ejemplo.casos.caso3.v1;
import java.util.HashMap;
public class StockService {
     private HashMap<String, Integer> stock;

    public StockService() {
        stock = new HashMap<>();
    }

    // Agregar stock de una prenda
    public void agregarStock(String prenda, int cantidad) {
        stock.put(prenda, cantidad);
        System.out.println("Stock agregado: " + prenda + " - " + cantidad);
    }

    // Ver stock
    public void verStock() {
        System.out.println("=== Stock Actual ===");
        for(String prenda : stock.keySet()) {
            System.out.println(prenda + " - " + stock.get(prenda));
        }
    }
}
