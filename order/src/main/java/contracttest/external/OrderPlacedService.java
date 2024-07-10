package contracttest.external;

import java.util.Date;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "order", url = "${api.url.order}")
public interface OrderPlacedService {
    @GetMapping(path = "/orderPlaceds")
    public List<OrderPlaced> getOrderPlaced();

    @GetMapping(path = "/orderPlaceds/{id}")
    public OrderPlaced getOrderPlaced(@PathVariable("id") Long id);
}
