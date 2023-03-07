package fa.training.dao;

import fa.training.entities.Employee;
import fa.training.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmployeeDAOImpl extends EmployeeDAO{
    @Override
    public boolean addEmployee(Employee employee) {
        try{
            Connection conn = DBUtils.getConnection();
            String sql = "INSERT INTO Employee VALUES(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, employee.getEmployee_id());
            ps.setString(2, employee.getEmployee_name());
            ps.setDouble(3, employee.getSalary());
            ps.setInt(4, employee.getSpvrld());
            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
