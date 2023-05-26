package ru.shashy.fileexchangerspring.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ru.shashy.fileexchangerspring.entity.Role;
import ru.shashy.fileexchangerspring.entity.UserRegistry;
import ru.shashy.fileexchangerspring.repository.RoleRepository;
import ru.shashy.fileexchangerspring.repository.UserRepository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    @PersistenceContext
    private EntityManager em;
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserService(UserRepository userRepository,
                       RoleRepository roleRepository,
                       BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserRegistry userRegistry = userRepository.findUserRegistriesByNickname(username);
        if (userRegistry == null) {
            throw new UsernameNotFoundException("User Not Found");
        }
        return userRegistry;
    }

    public boolean saveUser(UserRegistry userRegistry) {
        UserRegistry userRegistryFromDb
                = userRepository.findUserRegistriesByNickname(userRegistry.getNickname());
        if (userRegistryFromDb != null) return false;
        userRegistry.setRoles(Collections.singleton(new Role(1L, "ROLE_USER")));
        userRegistry.setPassword(bCryptPasswordEncoder.encode(userRegistry.getPassword()));
        userRepository.save(userRegistry);
        return true;
    }

    public UserRegistry findUserById(long id) {
        Optional<UserRegistry> userRegistryFromDb
                = Optional.ofNullable(userRepository.findUserRegistriesById(id));
        return userRegistryFromDb.orElse(new UserRegistry());
    }

    public List<UserRegistry> findAll() {
        return userRepository.findAll();
    }


    public boolean deleteUser(long id) {
        if (findUserById(id).isEnabled()) {
            userRepository.deleteUserRegistryById(id);
            return true;
        }
        return false;
    }

    public List<UserRegistry> usergtList(Long idMin) {
        return em.createQuery("SELECT u FROM UserRegistry u WHERE u.id > :paramId", UserRegistry.class)
                .setParameter("paramId", idMin).getResultList();
    }
}
