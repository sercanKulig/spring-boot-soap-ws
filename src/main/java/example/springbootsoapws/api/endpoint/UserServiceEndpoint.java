package example.springbootsoapws.api.endpoint;

import example.springbootsoapws.api.service.UserService;
import example.springbootsoapws.api.userws.UserRequest;
import example.springbootsoapws.api.userws.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserServiceEndpoint {

    private static final String NAMESPACE = "http://www.example/springbootsoapws/api/userWs";

    @Autowired
    private UserService userService;

    @PayloadRoot(namespace = NAMESPACE, localPart = "userRequest")
    @ResponsePayload
    public UserResponse userRequest(@RequestPayload UserRequest userRequest) {
        UserResponse userResponse = new UserResponse();
        userResponse.setUser(userService.getUser(userRequest));
        return userResponse;
    }

}
