package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import po.guitar.Guitar;
import po.guitar.GuitarSpec;
import service.GuitarService;

import java.util.List;

@RestController(value = "guitars")
public class GuitarController {

    @Autowired
    GuitarService guitarService;

    @PostMapping(value = "search")
    public ResponseEntity<List<Guitar>> searchGuitars(@RequestBody GuitarSpec guitarSpec) {
        return ResponseEntity.ok(guitarService.searchGuitar(guitarSpec));
    }
}