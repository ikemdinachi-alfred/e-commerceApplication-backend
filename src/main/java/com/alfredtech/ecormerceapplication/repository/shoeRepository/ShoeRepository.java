package com.alfredtech.ecormerceapplication.repository.shoeRepository;

import com.alfredtech.ecormerceapplication.model.Shoe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

public interface ShoeRepository extends JpaRepository<Shoe, Long> {
}
