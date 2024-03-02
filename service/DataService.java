package hw5.service;

import hw5.model.User;

import java.util.List;

public interface DataService {
    User create(User user);
    List<User> read();
}
