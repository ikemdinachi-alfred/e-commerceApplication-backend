package com.alfredtech.ecormerceapplication.repository.userRepository;

import com.alfredtech.ecormerceapplication.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByEmailAddress(String email);

    boolean existsByEmailAddress(String userEmail);
}
