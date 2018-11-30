package pl.atm.dietapp.dietapp.service;

import org.springframework.stereotype.Service;
import pl.atm.dietapp.dietapp.dto.UserDto;
import pl.atm.dietapp.dietapp.entity.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import pl.atm.dietapp.dietapp.exception.RegistrationException;
import pl.atm.dietapp.dietapp.repository.UserRepository;

@Service
public class UserService {


    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void save(UserDto userDto) throws RegistrationException {
        User user = new User();
        user.setUsername(userDto.getUsername());

        String encodedPassword = passwordEncoder.encode(userDto.getPassword());
        user.setPassword(encodedPassword);

        if(userRepository.findByUsername(user.getUsername()).isPresent()){
            throw new RegistrationException("Podany login jest już zajęty. Wybierz inny");
        } else {
            userRepository.save(user);
        }

    }

//    public void save(UserDto userDto)  {
//        User user = new User();
//        user.setUsername(userDto.getUsername());
//        user.setPassword(userDto.getPassword());
//
//        if(userRepository.findByUsername(user.getUsername()).isPresent()) {
//            if (!user.getUsername().equals(userRepository.findByUsername(user.getUsername()).get().getUsername())) {
//                userRepository.save(user);
////            } else {
////                throw new RegistrationException("Podany login jest już zajęty. Wybierz inny");
////        }
//
//
//
//        }
//        } else {
//            userRepository.save(user);
//        }}
}
