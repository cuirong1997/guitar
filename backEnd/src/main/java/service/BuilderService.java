package service;

import dao.BuilderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.builder.Builder;

import java.util.List;

@Service
public class BuilderService {

    @Autowired
    BuilderRepository builderRepository;
    public List<Builder> getAll(){
        return builderRepository.findAll();
    }
}
