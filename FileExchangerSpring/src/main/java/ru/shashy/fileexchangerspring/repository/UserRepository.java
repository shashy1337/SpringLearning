package ru.shashy.fileexchangerspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.shashy.fileexchangerspring.entity.UserRegistry;

@Repository
public interface UserRepository extends JpaRepository<UserRegistry, Long> {
    UserRegistry findUserRegistriesById(long id);

    UserRegistry findUserRegistriesByNickname(String nickname);

    @Transactional
    void deleteUserRegistryById(long id);
}
