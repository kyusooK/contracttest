package contracttest.domain;

import contracttest.domain.*;
import contracttest.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class Decreasestock extends AbstractEvent {

    private Long id;
    private Integer stock;

    public Decreasestock(Inventory aggregate) {
        super(aggregate);
    }

    public Decreasestock() {
        super();
    }
}
//>>> DDD / Domain Event
