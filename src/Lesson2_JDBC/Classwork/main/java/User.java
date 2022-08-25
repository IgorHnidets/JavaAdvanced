import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User2 {
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
}
