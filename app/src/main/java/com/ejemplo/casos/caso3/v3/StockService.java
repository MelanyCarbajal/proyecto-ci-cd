package com.ejemplo.casos.caso3.v3;
import java.util.HashMap;
public class StockService {
      private HashMap<String, Integer> stock;

    public StockService() {
        stock = new HashMap<>();
    }

    // Agregar stock con validación
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

    // Simulación de despliegue a producción
    public void desplegarProduccion() {
        System.out.println("=== Despliegue en producción iniciado ===");
        verStock();
        System.out.println("Despliegue completado exitosamente");
    }

    // Pruebas simuladas de despliegue
    public void pruebaDespliegue() {
        System.out.println("=== Prueba de despliegue ===");
        agregarStock("Camiseta", 50);
        agregarStock("Pantalón", 30);
        agregarStock("Chaqueta", 20);
        desplegarProduccion();
        System.out.println("=== Fin de prueba ===");
    }
}
