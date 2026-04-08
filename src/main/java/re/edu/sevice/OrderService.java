package re.edu.sevice;

import re.edu.dao.OrderDao;
import re.edu.model.Order;

import java.util.List;

public class OrderService {

    private final OrderDao dao = new OrderDao();

    public List<Order> getOrders() {
        return dao.getAll();
    }
}
