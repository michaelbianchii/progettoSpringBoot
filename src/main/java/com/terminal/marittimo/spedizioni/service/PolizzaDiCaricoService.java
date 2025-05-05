package com.terminal.marittimo.spedizioni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terminal.marittimo.spedizioni.entity.PolizzaDiCarico;
import com.terminal.marittimo.spedizioni.repository.PolizzaDiCaricoRepository;

@Service
public class PolizzaDiCaricoService {

    @Autowired
    private PolizzaDiCaricoRepository polizzaDiCaricoRepository;

    public List<PolizzaDiCarico> getAllPolizzeDiCarico() {
        return polizzaDiCaricoRepository.findAll();
    }

    public PolizzaDiCarico getPolizzaDiCaricoById(Long id) {
        return polizzaDiCaricoRepository.findById(id).orElse(null);
    }

    public PolizzaDiCarico savePolizzaDiCarico(PolizzaDiCarico polizzaDiCarico) {
        return polizzaDiCaricoRepository.save(polizzaDiCarico);
    }

    public void deletePolizzaDiCarico(Long id) {
        polizzaDiCaricoRepository.deleteById(id);
    }
}
