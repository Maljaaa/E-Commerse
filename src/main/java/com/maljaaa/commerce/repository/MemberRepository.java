package com.maljaaa.commerce.repository;

import com.maljaaa.commerce.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findByEmail(String email);
    boolean existsByEmail(String email);
}
