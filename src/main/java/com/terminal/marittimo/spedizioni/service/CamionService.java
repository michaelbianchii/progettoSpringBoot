package com.terminal.marittimo.spedizioni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terminal.marittimo.spedizioni.entity.Camion;
import com.terminal.marittimo.spedizioni.repository.CamionRepository;

@Service
public class CamionService {

    @Autowired
    private CamionRepository camionRepository;

    public List<Camion> getAllCamion() {
        return camionRepository.findAll();
    }

    public Camion getCamionById(Long id) {
        return camionRepository.findById(id).orElse(null);
    }

    public Camion saveCamion(Camion camion) {
        return camionRepository.save(camion);
    }

    public void deleteCamion(Long id) {
        camionRepository.deleteById(id);
    }
}

