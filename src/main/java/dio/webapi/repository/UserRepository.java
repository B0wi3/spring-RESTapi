package dio.webapi.repository;

import dio.webapi.model.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepository {
    public void save(User user) {
        if (user.getId()==null)
            System.out.println("SAVE");
        else
            System.out.println("UPDATE");

        System.out.println(user);
    }
    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id: %d", id));
        System.out.println(id);
    }
    public List<User> findAll() {
        System.out.println("LIST");
        List<User> users = new ArrayList<>();
        users.add(new User("Leonardo", "123789"));
        users.add(new User("Leiv", "abacaxi"));
        return users;
    }
    public User findById(Integer id) {
        System.out.println(String.format("FIND/id: %d", id));
        return new User("leonardo", "senha");
    }
    public User findByUsername(String username) {
        System.out.println(String.format("FIND/username: %s", username));
        return new User("leonardo", "senha");
    }
}
