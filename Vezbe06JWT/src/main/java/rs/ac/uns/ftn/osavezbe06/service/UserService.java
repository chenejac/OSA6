package rs.ac.uns.ftn.osavezbe06.service;

import rs.ac.uns.ftn.osavezbe06.model.dto.UserDTO;
import rs.ac.uns.ftn.osavezbe06.model.entity.User;

public interface UserService {

    User findByUsername(String username);

    User createUser(UserDTO userDTO);
}
