package contracttest.external;

import java.util.Date;
import lombok.Data;

@Data
public class Order {

    private Long id;
    private String userId;
    private String productId;
    private Integer qty;
    private String productName;
}
