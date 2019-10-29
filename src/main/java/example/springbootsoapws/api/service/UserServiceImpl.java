package example.springbootsoapws.api.service;

import example.springbootsoapws.api.userws.User;
import example.springbootsoapws.api.userws.UserRequest;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    private static final Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initialize() {
        User sercan = new User();
        sercan.setName("Sercan");
        sercan.setAge(33);
/*        ArrayList<String> sercanList = new ArrayList<>();
        sercanList.add("a");
        sercanList.add("b");
        sercan.setStyle(sercanList);*/

        User gizem = new User();
        gizem.setName("Gizem");
        gizem.setAge(30);
/*        ArrayList<String> gizemList = new ArrayList<>();
        gizemList.add("c");
        gizemList.add("d");
        gizem.setStyle(gizemList);*/

        users.put(sercan.getName(), sercan);
        users.put(gizem.getName(), gizem);
    }

    @Override
    public User getUser(UserRequest userRequest) {
        return users.get(userRequest.getName());
    }

}
