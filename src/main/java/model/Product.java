package model;

public class Product {
    private int id;
    private String name;
    private String price;
    private String describe;
    private String NXS;

    public Product() {
    }

    public Product(int id, String name, String price, String describe, String NXS) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.describe = describe;
        this.NXS = NXS;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getNXS() {
        return NXS;
    }

    public void setNXS(String NXS) {
        this.NXS = NXS;
    }
}
