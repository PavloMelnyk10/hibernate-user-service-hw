package mate.academy.security;

import mate.academy.exception.AuthenticationException;
import mate.academy.model.User;

public interface AuthenticationService {
    User login(String login, String password) throws AuthenticationException;

    void register(String email, String password) throws AuthenticationException;
}
