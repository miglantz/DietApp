package pl.atm.dietapp.dietapp.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.atm.dietapp.dietapp.service.UserService;

public class UserRestRepository {

    private UserService userService;

    public UserRestRepository(UserService userService) {
        this.userService = userService;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }
}
