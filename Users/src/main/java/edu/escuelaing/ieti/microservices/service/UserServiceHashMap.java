package edu.escuelaing.ieti.microservices.service;

import edu.escuelaing.ieti.microservices.data.User;
import edu.escuelaing.ieti.microservices.dto.UserDto;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

@Service
public class UserServiceHashMap implements UserService{

    private final HashMap<String, User> usersMap = new HashMap<>();

    @Override
    public User create(UserDto userDto) {
        User user = new User(userDto);
        usersMap.put(user.getId(),user);
        return user;
    }

    @Override
    public User findById(String id) {

        if (usersMap.containsKey(id)){
            return usersMap.get(id);
        }
        return null;
    }

    @Override
    public List<User> all() {
        return new ArrayList<>(usersMap.values());
    }

    @Override
    public boolean deleteById(String id) {
        try {
            usersMap.remove(id);
            return true;
        }catch (Exception e){
            return false;
        }

    }

    @Override
    public User update(UserDto userDto, String userId) {
        User user = new User(userId,userDto);
        usersMap.put(userId,user);
        return user;
    }
}
