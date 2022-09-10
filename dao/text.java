package Hello.dao;

import Hello.Pojo.User;

import java.io.IOException;
import java.util.ArrayList;

public class text {
    public static void main(String[] args) throws IOException {
        ArrayList<User> u = new ArrayList<>();

        User u1 = new User();
        u1.setName("54");
        u1.setPassword("5554");

        u.add(u1);

        Output.save(u);
    }
}
