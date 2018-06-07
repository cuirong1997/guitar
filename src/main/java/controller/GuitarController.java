package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import po.guitar.Guitar;
import po.guitar.GuitarSpec;
import service.GuitarService;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@CrossOrigin
@RestController()
@RequestMapping(value = "guitars", produces = {APPLICATION_JSON_UTF8_VALUE})
public class GuitarController {

    @Autowired
    GuitarService guitarService;

    @PostMapping(value = "search", consumes = {APPLICATION_JSON_UTF8_VALUE})
    public ResponseEntity<List<Guitar>> searchGuitars(@RequestBody GuitarSpec guitarSpec) {

        return ResponseEntity.ok(guitarService.searchGuitar(guitarSpec));
    }

    @GetMapping(value = "")
    public ResponseEntity<List<Guitar>> getAll() {
        return ResponseEntity.ok(guitarService.getAll());
    }
}