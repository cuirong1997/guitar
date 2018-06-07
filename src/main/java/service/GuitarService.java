package service;

import dao.GuitarRepository;
import domain.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.guitar.Guitar;
import po.guitar.GuitarSpec;

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
}
