package contracttest.external;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
@FeignClient(name = "order", url = "${api.url.order}")
public interface OrderService {
    @RequestMapping(method= RequestMethod., path="/orders/{id}")
    public void orderPlaced(@PathVariable("id") Long id, @RequestBody OrderPlacedCommand orderPlacedCommand );
}