import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShopService shopService = new ShopService();

        // Produkte hinzufügen
        shopService.addProduct(1, "Produkt 1", "Beschreibung 1", 10.0);
        shopService.addProduct(2, "Produkt 2", "Beschreibung 2", 20.0);
        shopService.addProduct(3, "Produkt 3", "Beschreibung 3", 30.0);

        // Alle Produkte anzeigen
        List<Product> productList = shopService.getAllProducts();
        System.out.println("Alle Produkte:");
        for (Product produk+ct : productList) {
            System.out.println(product);
        }

        // Einzelnes Produkt anzeigenn
        Product product = shopService.getProductById(2);
        System.out.println("\nProdukt mit der ID 2:");
        System.out.println(product);

        // Bestellung aufgeben
        List<Integer> productIds = new ArrayList<>();
        productIds.add(1);
        productIds.add(3);
        try {
            shopService.placeOrder(productIds);
        } catch (Exception e) {
            System.out.println("Fehler: " + e.getMessage());
        }

        // Alle Bestellungen anzeigen
        List<Order> orderList = shopService.getAllOrders();
        System.out.println("\nAlle Bestellungen:");
        for (Order order : orderList) {
            System.out.println(order);
        }

        // Einzelne Bestellung anzeigen
        Order order = shopService.getOrderById(1);
        System.out.println("\nBestellung mit der ID 1:");
        System.out.println(order);
    }
}
