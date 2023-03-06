package fa.training.dao;

import fa.training.entities.Customer;
import fa.training.utils.DBUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> customers = new ArrayList<>();
        try {
            Connection conn = DBUtils.getConnection();
            Statement stm= conn.createStatement();
            String sql = "select * from Customer";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                Customer customer = new Customer();
                int customer_id = rs.getInt(1);
                String customer_name = rs.getString(2);
                customers.add(customer);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return customers;
    }

    @Override
    public boolean addCustomer(Customer customer) {
        try {
            Connection conn = DBUtils.getConnection();
            String sql = "insert into Customer(customer_id,customer_name) values(?,?)";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, customer.getCustomer_id());
            stm.setString(2, customer.getCustomer_name());
            int result = stm.executeUpdate();
            if (result > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteCustomer(int customerId) {
        try {
            Connection conn = DBUtils.getConnection();
            String sql = "delete from Customer where customer_id = ?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, customerId);
            int result = stm.executeUpdate();
            if (result > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        try {
            Connection conn = DBUtils.getConnection();
            String sql = "update Customer set customer_id = ?, customer_name = ? where customer_name = ?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, customer.getCustomer_id());
            stm.setString(2, customer.getCustomer_name());
            int result = stm.executeUpdate();
            if (result > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}

