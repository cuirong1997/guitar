package com.github.cumtfc.guitar.service;

import com.github.cumtfc.guitar.dao.GuitarRepository;
import com.github.cumtfc.guitar.domain.Inventory;
import com.github.cumtfc.guitar.po.guitar.Guitar;
import com.github.cumtfc.guitar.po.guitar.GuitarSpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuitarService {

    @Autowired
    GuitarRepository guitarRepository;

    public List<Guitar> searchGuitar(GuitarSpec guitarSpec) {
        Inventory inventory = new Inventory();
        return inventory.search(guitarSpec, guitarRepository.findAll());
    }

    public List<Guitar> getAll() {
        return guitarRepository.findAll();
    }

    public Guitar save(Guitar guitar) {
        return guitarRepository.save(guitar);
    }

    public boolean deleteById(Integer id) {
        guitarRepository.deleteById(id);
        return true;
    }
}
