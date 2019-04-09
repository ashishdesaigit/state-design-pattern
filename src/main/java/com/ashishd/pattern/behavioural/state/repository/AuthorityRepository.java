package com.ashishd.pattern.behavioural.state.repository;

import com.ashishd.pattern.behavioural.state.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
