
package contracttest.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;
import java.util.List;


@FeignClient(name = "inventory", url = "${api.url.inventory}")
 
public interface DecreaseStockService {
    @GetMapping(path="/decreaseStocks")
    public List<DecreaseStock> getDecreaseStock();

    @GetMapping(path="/decreaseStocks/{id}")
    public DecreaseStock getDecreaseStock(@PathVariable("id")  id);
}


