package contracttest.external;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class DecreasestockCommand {

    @Id
    private Long id;

    private Integer stock;
}
