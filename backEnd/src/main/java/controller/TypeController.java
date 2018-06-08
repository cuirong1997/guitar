package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import po.guitar.Guitar;
import po.type.Type;
import service.TypeService;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@CrossOrigin
@RestController()
@RequestMapping(value = "types", produces = {APPLICATION_JSON_UTF8_VALUE})
public class TypeController {

    @Autowired
    TypeService typeService;

    @GetMapping(value = "")
    public ResponseEntity<List<Type>> getAll() {
        return ResponseEntity.ok(typeService.getAll());
    }
}