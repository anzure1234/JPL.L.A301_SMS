package fa.training.entities;

public class Product {
    private int product_id;
    private String product_name;
    private double list_price;

    public Product() {
    }

    public Product(int product_id, String product_name, double list_price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.list_price = list_price;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getList_price() {
        return list_price;
    }

    public void setList_price(double list_price) {
        this.list_price = list_price;
    }
}
