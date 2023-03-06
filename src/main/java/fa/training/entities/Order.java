package fa.training.entities;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Order {
    private int order_id;
    private LocalDate orderDate;
    private int customer_id;
    private int employee_id;
    private double total;

    public Order() {
    }

    public Order(int order_id, LocalDate orderDate, int customer_id, int employee_id, double total) {
        this.order_id = order_id;
        this.orderDate = orderDate;
        this.customer_id = customer_id;
        this.employee_id = employee_id;
        this.total = total;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void addOrder(){
        Scanner sc = new Scanner(System.in);
        Order order = new Order();
        System.out.println("Enter order id: ");
        order.setOrder_id(sc.nextInt());
        System.out.println("Enter order date: ");
        order.setOrderDate(LocalDate.parse(sc.next()));
        System.out.println("Enter customer id: ");
        order.setCustomer_id(sc.nextInt());
        System.out.println("Enter employee id: ");
        order.setEmployee_id(sc.nextInt());
        System.out.println("Enter total: ");
        order.setTotal(sc.nextDouble());
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", orderDate='" + orderDate + '\'' +
                ", customer_id=" + customer_id +
                ", employee_id=" + employee_id +
                ", total=" + total +
                '}';
    }
}
