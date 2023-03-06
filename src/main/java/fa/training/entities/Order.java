package fa.training.entities;

import java.util.Date;

public class Order {
    private int order_id;
    private Date orderDate;
    private int customer_id;
    private int employee_id;
    private double total;

    public Order() {
    }

    public Order(int order_id, Date orderDate, int customer_id, int employee_id, double total) {
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

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
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
}
