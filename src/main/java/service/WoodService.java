package service;

import dao.WoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.builder.Builder;
import po.wood.Wood;

import java.util.List;

@Service
public class WoodService {

    @Autowired
    WoodRepository woodRepository;
    public List<Wood> getAll(){
        return woodRepository.findAll();
    }
}
