package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import po.guitar.Guitar;
import po.guitar.GuitarSpec;
import po.wood.Wood;
import service.WoodService;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@CrossOrigin
@RestController()
@RequestMapping(value = "woods", produces = {APPLICATION_JSON_UTF8_VALUE})
public class WoodController {

    @Autowired
    WoodService woodService;

    @GetMapping(value = "")
    public ResponseEntity<List<Wood>> getAll() {
        return ResponseEntity.ok(woodService.getAll());
    }
}