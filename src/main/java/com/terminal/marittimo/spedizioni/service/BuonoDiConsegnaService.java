package com.terminal.marittimo.spedizioni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terminal.marittimo.spedizioni.entity.BuonoDiConsegna;
import com.terminal.marittimo.spedizioni.repository.BuonoDiConsegnaRepository;

@Service
public class BuonoDiConsegnaService {

    @Autowired
    private BuonoDiConsegnaRepository buonoDiConsegnaRepository;

    public List<BuonoDiConsegna> getAllBuoniDiConsegna() {
        return buonoDiConsegnaRepository.findAll();
    }

    public BuonoDiConsegna getBuonoDiConsegnaById(Long id) {
        return buonoDiConsegnaRepository.findById(id).orElse(null);
    }

    public BuonoDiConsegna saveBuonoDiConsegna(BuonoDiConsegna buonoDiConsegna) {
        return buonoDiConsegnaRepository.save(buonoDiConsegna);
    }

    public void deleteBuonoDiConsegna(Long id) {
        buonoDiConsegnaRepository.deleteById(id);
    }
}
