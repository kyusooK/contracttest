package contracttest.external;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class OrderPlacedCommand {

    @Id
    private Long id;

    private String userId;
    private String productId;
    private Integer qty;
    private String productName;
}
