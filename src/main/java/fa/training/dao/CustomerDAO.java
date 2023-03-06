package fa.training.dao;

import fa.training.entities.Customer;
import fa.training.entities.Order;

import java.util.List;

public interface CustomerDAO {

    List<Customer> getAllCustomer();
    boolean addCustomer(Customer customer);
    boolean deleteCustomer(int customerId);
    boolean updateCustomer(Customer customer);
    List<Order> getAllOrdersByCustomerId(int customerId);




}
