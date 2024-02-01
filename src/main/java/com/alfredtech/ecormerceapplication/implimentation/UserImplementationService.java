package com.alfredtech.ecormerceapplication.implimentation;

import com.alfredtech.ecormerceapplication.repository.userRepository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserImplementationService {
    private final UserRepository userRepository;


}
