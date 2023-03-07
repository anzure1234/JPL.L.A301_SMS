package fa.training.dao;

import fa.training.entities.Product;
import fa.training.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProductDAOImpl implements ProductDAO {

    @Override
    public boolean addProduct(Product product) {
        try {
            Connection conn = DBUtils.getConnection();
            String sql = "INSERT INTO Product VALUES(?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, product.getProduct_id());
            ps.setString(2, product.getProduct_name());
            ps.setDouble(3, product.getList_price());
            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
