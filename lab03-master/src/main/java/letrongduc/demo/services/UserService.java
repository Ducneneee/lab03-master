package letrongduc.demo.services;

import letrongduc.demo.enity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import letrongduc.demo.enity.User;
import letrongduc.demo.repository.IRoleRepository;
import letrongduc.demo.repository.IUserRepository;

@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IRoleRepository roleRepository;

    public void save(User user){
        userRepository.save(user);
        Long userId = userRepository.getUserIdByUsername(user.getUsername());
        Long roleId = roleRepository.getRoleIdByName("USER");
        if (roleId != 0 && userId != 0){
            userRepository.addRoleToUser(userId,roleId);
        }
    }
}
