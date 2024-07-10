package contracttest.domain;

import contracttest.domain.*;
import contracttest.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userId;
    private String productId;
    private Integer qty;
    private String productName;
}
