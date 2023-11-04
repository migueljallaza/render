package com.example.demo.controller;

import com.example.demo.entity.Activo;
import com.example.demo.repository.IActivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/activo/")
public class ActivoController {
    @Autowired
    IActivoRepository activoRepository;

    @GetMapping("list")
    public List<Activo> showAll() {
        return activoRepository.findAll(Sort.by("id").descending());
    }

    @PostMapping("register")
    public ResponseEntity<Activo> showSave(@RequestBody Activo activo) {
        return new ResponseEntity<Activo>(activoRepository.save(activo), HttpStatus.CREATED);
    }
}
