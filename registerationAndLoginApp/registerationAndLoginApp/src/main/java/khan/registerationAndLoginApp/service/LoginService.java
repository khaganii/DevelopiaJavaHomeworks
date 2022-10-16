package khan.registerationAndLoginApp.service;

import khan.registerationAndLoginApp.entity.Login;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
public class LoginService {
    DataSource ds;
    public String checkPassword(Login loginInfo) {

        return null;
    }
}
