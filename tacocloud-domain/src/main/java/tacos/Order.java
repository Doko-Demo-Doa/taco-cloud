package tacos;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {

    public static final Long serialVersionUID = 1L;

    private Long id;

    private Date placedAt;
}
