package com.terminal.marittimo.spedizioni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terminal.marittimo.spedizioni.entity.Autista;
import com.terminal.marittimo.spedizioni.repository.AutistaRepository;

@Service
public class AutistaService {

    @Autowired
    private AutistaRepository autistaRepository;

    public List<Autista> getAllAutisti() {
        return autistaRepository.findAll();
    }

    public Autista getAutistaById(Long id) {
        return autistaRepository.findById(id).orElse(null);
    }

    public Autista saveAutista(Autista autista) {
        return autistaRepository.save(autista);
    }

    public void deleteAutista(Long id) {
        autistaRepository.deleteById(id);
    }
}
