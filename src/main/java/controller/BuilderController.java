package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import po.builder.Builder;
import po.guitar.Guitar;
import po.guitar.GuitarSpec;
import service.BuilderService;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@CrossOrigin
@RestController()
@RequestMapping(value = "builders", produces = {APPLICATION_JSON_UTF8_VALUE})
public class BuilderController {

    @Autowired
    BuilderService builderService;

    @GetMapping(value = "")
    public ResponseEntity<List<Builder>> getAll() {
        return ResponseEntity.ok(builderService.getAll());
    }
}