package example.springbootsoapws.api.service;

import example.springbootsoapws.api.userws.User;
import example.springbootsoapws.api.userws.UserRequest;

public interface UserService {
    User getUser(UserRequest userRequest);
}
