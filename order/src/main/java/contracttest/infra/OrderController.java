package contracttest.infra;

import contracttest.domain.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

    @GetMapping("/orders/{id}")
    public ResponseEntity<Order> orderStockCheck(
        @PathVariable(value = "id") Long id
    ) {
        return orderRepository
            .findById(id)
            .map(order -> ResponseEntity.ok().body(order))
            .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
