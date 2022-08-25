import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User1Test {

    User1.Adress adress = new User1.Adress("Kyiv","Shevchnko");
    User1 user = new User1("Igor Hnidets",adress,20, new ArrayList<String>(List.of("cat")));
    @BeforeEach
    public void init() {
        System.out.println("Before: " + user);
    }

    @AfterEach
    public void disconnect() {
        System.out.println("After: " + user);
//        user = null;
    }


    @Test
    @DisplayName("Testing on 18")
    public void TestOn18() throws Exception{
        if (user.getAge()<18) throw new Exception("User dont have 18");
    }

    @Test
    @DisplayName("Add a address")
    public void TestAddAddress(){
        adress = new User1.Adress("Lviv","Mykolaychuka");
        user.setAdress(adress);
        System.out.println("User1 have a new adress - " + user.getAdress() );
    }

    @Test
    @DisplayName("Remove a address")
    public void TestRemAddress(){
        adress = new User1.Adress(null,null);
        user.setAdress(adress);
    }

    @Test
    @DisplayName("Add Animal")
    public void AddAnimal(){
        user.animal.add("cat");
    }

    @Test
    @DisplayName("Remove Animal")
    public void RemAnimal(){
        user.animal.remove("cat");
    }

    @Test
    @DisplayName("Change a fullname")
    public void ChangeName(){
        user.fullname = "Igor K";
    }
}
