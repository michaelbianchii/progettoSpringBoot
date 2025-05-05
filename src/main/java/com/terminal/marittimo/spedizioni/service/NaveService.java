package com.terminal.marittimo.spedizioni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terminal.marittimo.spedizioni.entity.Nave;
import com.terminal.marittimo.spedizioni.repository.NaveRepository;

@Service
public class NaveService {

    @Autowired
    private NaveRepository naveRepository;

    public List<Nave> getAllNavi() {
        return naveRepository.findAll();
    }

    public Nave getNaveById(Long id) {
        return naveRepository.findById(id).orElse(null);
    }

    public Nave saveNave(Nave nave) {
        return naveRepository.save(nave);
    }

    public void deleteNave(Long id) {
        naveRepository.deleteById(id);
    }
}

