package com.terminal.marittimo.spedizioni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terminal.marittimo.spedizioni.entity.Viaggio;
import com.terminal.marittimo.spedizioni.repository.ViaggioRepository;

@Service
public class ViaggioService {

    @Autowired
    private ViaggioRepository viaggioRepository;

    public List<Viaggio> getAllViaggi() {
        return viaggioRepository.findAll();
    }

    public Viaggio getViaggioById(Long id) {
        return viaggioRepository.findById(id).orElse(null);
    }

    public Viaggio saveViaggio(Viaggio viaggio) {
        return viaggioRepository.save(viaggio);
    }

    public void deleteViaggio(Long id) {
        viaggioRepository.deleteById(id);
    }
}

