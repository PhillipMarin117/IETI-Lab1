package edu.escuelaing.ieti.microservices.service;

import edu.escuelaing.ieti.microservices.data.User;
import edu.escuelaing.ieti.microservices.dto.UserDto;

import java.util.List;

public interface UserService {

    User create(UserDto user );
    User findById( String id );
    List<User> all();
    boolean deleteById( String id );
    User update(UserDto user, String userId );

}
