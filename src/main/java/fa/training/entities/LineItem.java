package fa.training.entities;

import java.util.Scanner;

public class LineItem {
    private int order_id;
    private int product_id;
    private int quantity;
    private double price;
    public LineItem(){

    }

    public LineItem(int order_id, int product_id, int quantity, double price) {
        this.order_id = order_id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.price = price;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addLineItem(){
        Scanner sc = new Scanner(System.in);
        LineItem lineItem = new LineItem();
        System.out.println("Enter order id: ");
        lineItem.setOrder_id(sc.nextInt());
        System.out.println("Enter product id: ");
        lineItem.setProduct_id(sc.nextInt());
        System.out.println("Enter quantity: ");
        lineItem.setQuantity(sc.nextInt());
        System.out.println("Enter price: ");
        lineItem.setPrice(sc.nextDouble());

    }
}
