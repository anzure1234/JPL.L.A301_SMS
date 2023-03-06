package fa.training.dao;

import fa.training.entities.LineItem;
import fa.training.entities.Order;
import fa.training.utils.DBUtils;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OrderDAOimpl implements OrderDAO {

    @Override
    public List<LineItem> getAllItemsByOrderId(int orderId) {
        List<LineItem> lineItems = new ArrayList<>();
        try {
            Connection conn = DBUtils.getConnection();
            String sql = "select * from LineItem where order_id = ?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, orderId);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                LineItem lineItem = new LineItem();
                lineItem.setOrder_id(rs.getInt(1));
                lineItem.setProduct_id(rs.getInt(2));
                lineItem.setQuantity(rs.getInt(3));
                lineItem.setPrice(rs.getDouble(4));
                lineItems.add(lineItem);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lineItems;
    }

    @Override
    public double computeOrderTotal(int orderId) {
        double total = 0;
        try {
            Connection conn = DBUtils.getConnection();
            String sql = "select sum(unit_price * quantity) as total from Order_Details where order_id = ?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, orderId);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                total = rs.getDouble("total");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;
    }

    @Override
    public boolean addOrder(Order order) {
        try {
            Connection conn = DBUtils.getConnection();
            String sql = "insert into Orders(order_id,order_date,customer_id,employee_id,total) values(?,?,?,?,?)";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, order.getOrder_id());
            stm.setDate(2, Date.valueOf(order.getOrderDate()));
            stm.setInt(3, order.getCustomer_id());
            stm.setInt(4, order.getEmployee_id());
            stm.setDouble(5, order.getTotal());
            int result = stm.executeUpdate();
            if (result > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateOrderTotal(int orderId) {
        try {
            Connection conn = DBUtils.getConnection();
            String sql = "update Orders set total = ? where order_id = ?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setDouble(1, computeOrderTotal(orderId));
            stm.setInt(2, orderId);
            int result = stm.executeUpdate();
            if (result > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }