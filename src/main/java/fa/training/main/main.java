package fa.training.main;

import fa.training.dao.*;
import fa.training.entities.*;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerDAOImpl customerDAO = new CustomerDAOImpl();
        OrderDAOimpl orderDAO = new OrderDAOimpl();
        LineItemDAOImpl lineItemDAO = new LineItemDAOImpl();
        ProductDAOImpl productDAO = new ProductDAOImpl();
        EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();

        List<Customer> customers = new ArrayList<>();
        List<Order> orders = new ArrayList<>();
        List<LineItem> lineItems = new ArrayList<>();

        System.out.println("-----Choose your option-----");
        System.out.println("1. Add new customer");
        System.out.println("2. Update customer");
        System.out.println("3. Delete customer");
        System.out.println("4. Get all customer");
        System.out.println("5. Add new order");
        System.out.println("6. Update order total");
        System.out.println("7. Compute order total");
        System.out.println("8. Get all items by order id");
        System.out.println("9. Add line item");
        System.out.println("10. Add product ");
        System.out.println("11. Add Employee");
        System.out.println("10. Exit");
        while(true){
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Add new customer");
                    Customer customer = new Customer();
                    customer.addCustomer();
                    customerDAO.addCustomer(customer);
                    System.out.println("Add new customer successfully");
                    break;
                case 2:
                    System.out.println("Update customer");
                    System.out.println("Enter customer id: ");
                    int id = sc.nextInt();
                    System.out.println("Enter customer name: ");
                    String name = sc.next();
                    customerDAO.updateCustomer(new Customer(id, name));

                    System.out.println("Update customer successfully");
                    break;
                case 3:
                    System.out.println("Delete customer");
                    System.out.println("Enter customer id: ");
                    int id1 = sc.nextInt();
                    customerDAO.deleteCustomer(id1);
                    System.out.println("Delete customer successfully");

                    break;
                case 4:
                    System.out.println("Get all customer");
                    customers = customerDAO.getAllCustomer();
                    for (Customer customer1 : customers) {
                        System.out.println(customer1);
                    }
                    break;
                case 5:
                    System.out.println("Add new order");
                    Order order = new Order();
                    order.addOrder();
                    orderDAO.addOrder(order);
                    System.out.println("Add new order successfully");
                    break;
                case 6:
                    System.out.println("Compute order total");
                    System.out.println("Enter order id: ");
                    int id2 = sc.nextInt();
                    orderDAO.updateOrderTotal(id2);
                    System.out.println("Update order total successfully");
                    break;
                case 7:
                    System.out.println("Add order total");
                    System.out.println("Enter order id: ");
                    int id3 = sc.nextInt();
                    orderDAO.computeOrderTotal(id3);
                    System.out.println("Compute order total successfully");
                    break;
                case 8:

                    System.out.println("Enter order id: ");
                    int id4 = sc.nextInt();
                    System.out.println("Get all items by order id");

                    System.out.println(orderDAO.getAllItemsByOrderId(id4).toString());



                    break;
                case 9:
                    System.out.println("Add line item");
                    LineItem lineItem = new LineItem();
                    lineItem.addLineItem();
                    lineItemDAO.addLineItem(lineItem);
                    System.out.println("Add line item successfully");
                    break;

                case 10:
                    System.out.println("Add product");
                    Product product = new Product();
                    product.addProduct();
                    productDAO.addProduct(product);
                    System.out.println("Add product successfully");
                case 11:
                    System.out.println("Add employee");
                    Employee employee = new Employee();
                    employee.addEmployee();
                    employeeDAO.addEmployee(employee);
                    System.out.println("Add employee successfully");

                case :
                    System.out.println("Exit");
                    System.exit(choice);

            }
        }

    }

}
