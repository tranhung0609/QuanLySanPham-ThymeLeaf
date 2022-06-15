package service;


import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
    private static final Map<Integer, Product> products;

    static {

        products = new HashMap<>();
        products.put(1, new Product(1, "R15", "3500$", "New", "Yamaha"));
        products.put(2, new Product(2, "R6", "11000$", "New", "Yamaha"));
        products.put(3, new Product(3, "R1", "50000$", "99%", "Yamaha"));
        products.put(4, new Product(4, "CBR150", "4000$", "New", "Honda"));
        products.put(5, new Product(5, "CBR600", "7000$", "New", "Honda"));
        products.put(6, new Product(6, "ZX-10R", "400000$", "New", "Kawasaki"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product customer) {
        products.put(customer.getId(), customer);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product customer) {
        products.put(id, customer);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    public List<Product> findByName(String name) {
        List<Product> products1 = new ArrayList<>();
        for (int i :
                products.keySet()) {
            if (products.get(i).getName().contains(name)) {
                products1.add(products.get(i));
            }
        }
        return products1;
    }
}
