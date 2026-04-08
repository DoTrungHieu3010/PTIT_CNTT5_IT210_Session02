package re.edu.dao;

import re.edu.model.Order;

import java.util.*;

public class OrderDao {

    public List<Order> getAll() {
        return Arrays.asList(
                new Order("1", "Laptop", 1500000, new Date()),
                new Order("2", "Mouse", 200000, new Date()),
                new Order("3", "Keyboard", 500000, new Date())
        );
    }
}
