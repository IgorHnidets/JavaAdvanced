import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@AllArgsConstructor()
@Data
public class User1 {
    public static void main(String[] args) {
    }


    public String fullname;
    public Adress adress;
    public int age;
    ArrayList<String> animal = new ArrayList<>();

    @AllArgsConstructor
    @Data
    static
    class Adress {
        public String city;
        public String street;

    }
}
