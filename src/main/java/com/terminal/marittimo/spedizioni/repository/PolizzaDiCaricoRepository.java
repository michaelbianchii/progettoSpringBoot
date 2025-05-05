package com.terminal.marittimo.spedizioni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.terminal.marittimo.spedizioni.entity.PolizzaDiCarico;

@Repository
public interface PolizzaDiCaricoRepository extends JpaRepository<PolizzaDiCarico, Long> {
}


