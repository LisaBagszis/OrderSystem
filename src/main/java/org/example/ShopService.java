package org.example;

public class ShopService {

    private String ProductRepo;

  //  String addOrder();
    private String OrderRepo;


    public ShopService(String productRepo, String orderRepo) {
        ProductRepo = productRepo;
        OrderRepo = orderRepo;
    }
}
