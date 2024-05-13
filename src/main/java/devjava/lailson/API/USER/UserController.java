package devjava.lailson.API.USER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    public ResponseEntity user(@RequestBody UserDto userDto){
        User user = new User();
        user.setNome(userDto.getNome());
        user.setCpf(userDto.getCpf());
        user.setEmail(userDto.getEmail());
        user.setConta(userDto.getConta());
        User userCreated = userRepository.save(user);
        return ResponseEntity.ok().body(userCreated);
    }
}
