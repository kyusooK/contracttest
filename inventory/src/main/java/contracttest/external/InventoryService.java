package contracttest.external;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
@FeignClient(name = "inventory", url = "${api.url.inventory}")
public interface InventoryService {
    @RequestMapping(method= RequestMethod., path="/inventories/{id}")
    public void decreasestock(@PathVariable("id") Long id, @RequestBody DecreasestockCommand decreasestockCommand );
}