package riski.project.order;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Calendar;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Order {

    int id;
    double total_price;
    Calendar created_at;
    String email;
    String browser_ip;
    String currency;
    boolean digital;
    BillingInfo billing_info;
    ArrayList<Product> products;
}
