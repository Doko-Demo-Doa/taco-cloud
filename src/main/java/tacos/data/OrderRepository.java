package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.Order;
import tacos.User;

public interface OrderRepository extends CrudRepository<Order, Long> {
    User findByUsername(String username);
}
