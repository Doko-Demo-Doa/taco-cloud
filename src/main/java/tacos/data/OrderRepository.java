package tacos.data;

import tacos.Order;

import java.util.List;

public interface OrderRepository {
    Order save(Order order);
}
