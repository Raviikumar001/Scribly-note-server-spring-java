// package com.example.backend.service;

// import com.example.backend.model.User;
// import com.example.backend.repository.UserRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.stereotype.Service;

// @Service
// public class UserService {

//     private final UserRepository userRepository;
//     private final BCryptPasswordEncoder passwordEncoder;

//     @Autowired
//     public UserService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
//         this.userRepository = userRepository;
//         this.passwordEncoder = passwordEncoder;
//     }

//     public String register(User user) {
//         if (userRepository.findByEmail(user.getEmail()) != null) {
//             return "User already Exists";
//         }

//         user.setPassword(passwordEncoder.encode(user.getPassword()));

//         userRepository.save(user);

//         return "User Created";
//     }
// }

// package com.example.backend.service;

// import com.example.backend.model.User;
// import com.example.backend.repository.UserRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.stereotype.Service;

// @Service
// public class UserService {

//     private final UserRepository userRepository;
//     private final BCryptPasswordEncoder passwordEncoder;  // Injected dependency

//     @Autowired
//     public UserService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
//         this.userRepository = userRepository;
//         this.passwordEncoder = passwordEncoder;
//     }

//     public String register(User user) {
//         if (userRepository.findByEmail(user.getEmail()) != null) {
//             return "User already Exists";
//         }

//         // Encode password before saving
//         user.setPassword(passwordEncoder.encode(user.getPassword()));

//         userRepository.save(user);

//         return "User Created";
//     }
// }

package com.example.backend.service;

import com.example.backend.model.User;
import com.example.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public String register(User user) {
        if (userRepository.findByEmail(user.getEmail()) != null) {
            return "User already Exists";
        }

        // Encode password before saving
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        userRepository.save(user);

        return "User Created";
    }
}