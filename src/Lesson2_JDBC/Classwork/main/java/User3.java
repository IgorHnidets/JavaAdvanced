import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User3 {
    private int id;
    private String manufacturer;
    private String model;
    private int price;
    private int model_year;
}
