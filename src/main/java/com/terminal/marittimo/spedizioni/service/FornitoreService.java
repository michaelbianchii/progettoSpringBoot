package com.terminal.marittimo.spedizioni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terminal.marittimo.spedizioni.entity.Fornitore;
import com.terminal.marittimo.spedizioni.repository.FornitoreRepository;

@Service
public class FornitoreService {

    @Autowired
    private FornitoreRepository fornitoreRepository;

    public List<Fornitore> getAllFornitori() {
        return fornitoreRepository.findAll();
    }

    public Fornitore getFornitoreById(Long id) {
        return fornitoreRepository.findById(id).orElse(null);
    }

    public Fornitore saveFornitore(Fornitore fornitore) {
        return fornitoreRepository.save(fornitore);
    }

    public void deleteFornitore(Long id) {
        fornitoreRepository.deleteById(id);
    }
}

