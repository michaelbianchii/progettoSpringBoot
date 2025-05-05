package com.terminal.marittimo.spedizioni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.terminal.marittimo.spedizioni.entity.Fornitore;

@Repository
public interface FornitoreRepository extends JpaRepository<Fornitore, Long> {
}
