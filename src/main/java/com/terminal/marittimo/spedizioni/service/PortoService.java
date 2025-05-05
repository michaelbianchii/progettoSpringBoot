package com.terminal.marittimo.spedizioni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terminal.marittimo.spedizioni.entity.Porto;
import com.terminal.marittimo.spedizioni.repository.PortoRepository;

@Service
public class PortoService {

    @Autowired
    private PortoRepository portoRepository;

    public List<Porto> getAllPorti() {
        return portoRepository.findAll();
    }

    public Porto getPortoById(Long id) {
        return portoRepository.findById(id).orElse(null);
    }

    public Porto savePorto(Porto porto) {
        return portoRepository.save(porto);
    }

    public void deletePorto(Long id) {
        portoRepository.deleteById(id);
    }
}
