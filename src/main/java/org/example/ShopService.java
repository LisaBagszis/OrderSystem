package org.example;

public class ShopService {
    private ProductRepo productRepo;
    private OrderRepo orderRepo;
    private int nextOrderId;

    public ShopService() {
        this.productRepo = new ProductRepo();
        this.orderRepo = new OrderRepo();
        this.nextOrderId = 1;
    }

    public void addProduct(int id, String name) {
        Product product = new Product(id, name);
        productRepo.addProduct(product);
    }

    public Product getProductById(int id) throws ProductNotFoundException {
        Product product = productRepo.getProductById(id);
        if (product == null) {
            throw new ProductNotFoundException("Produkt mit der ID " + id + " wurde nicht gefunden.");
        }
        return product;
    }

    public void placeOrder(List<Integer> productIds) throws ProductNotFoundException {
        List<Product> products = new ArrayList<>();
        for (int id : productIds) {
            Product product = getProductById(id);
            products.add(product);
        }
        Order order = new Order(nextOrderId++, products);
        orderRepo.addOrder(order);
    }

    public Order getOrderById(int id) throws OrderNotFoundException {
        Order order = orderRepo.getOrderById(id);
        if (order == null) {
            throw new OrderNotFoundException("Bestellung mit der ID " + id + " wurde nicht gefunden.");
        }
        return order;
    }

    public List<Product> getAllProducts() {
        return productRepo.getAllProducts();
    }

    public List<Order> getAllOrders() {
        return orderRepo.getAllOrders();
    }
}
