package fa.training.dao;

import fa.training.entities.LineItem;
import fa.training.entities.Order;

public interface LineItemDAO {
    boolean addOrder(Order order);
    boolean addLineItem(LineItem item);



}
