package service;

import dao.BuilderRepository;
import dao.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.builder.Builder;
import po.type.Type;

import java.util.List;

@Service
public class TypeService {

    @Autowired
    TypeRepository typeRepository;
    public List<Type> getAll(){
        return typeRepository.findAll();
    }
}
