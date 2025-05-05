package com.terminal.marittimo.spedizioni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terminal.marittimo.spedizioni.entity.RegistroRitiri;
import com.terminal.marittimo.spedizioni.repository.RegistroRitiriRepository;

@Service
public class RegistroRitiriService {

    @Autowired
    private RegistroRitiriRepository registroRitiriRepository;

    public List<RegistroRitiri> getAllRegistriRitiri() {
        return registroRitiriRepository.findAll();
    }

    public RegistroRitiri getRegistroRitiriById(Long id) {
        return registroRitiriRepository.findById(id).orElse(null);
    }

    public RegistroRitiri saveRegistroRitiri(RegistroRitiri registroRitiri) {
        return registroRitiriRepository.save(registroRitiri);
    }

    public void deleteRegistroRitiri(Long id) {
        registroRitiriRepository.deleteById(id);
    }
}
