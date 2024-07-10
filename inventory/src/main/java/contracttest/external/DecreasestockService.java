package contracttest.external;

import java.util.Date;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "inventory", url = "${api.url.inventory}")
public interface DecreasestockService {
    @GetMapping(path = "/decreasestocks")
    public List<Decreasestock> getDecreasestock();

    @GetMapping(path = "/decreasestocks/{id}")
    public Decreasestock getDecreasestock(@PathVariable("id") Long id);
}
