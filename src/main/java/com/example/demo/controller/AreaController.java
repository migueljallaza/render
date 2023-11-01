package com.example.demo.controller;

import com.example.demo.entity.Area;
import com.example.demo.entity.User;
import com.example.demo.repository.IAreaRepository;
import com.example.demo.service.IAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/area/")

public class AreaController {

    @Autowired
    IAreaRepository areaRepository;

    @GetMapping("list")
    public List<Area> showAllJobs() {
        return areaRepository.findAll(Sort.by("id").descending());
    }

    @PostMapping("register")
    public ResponseEntity<Area> showSaveJobs(@RequestBody Area area) {
        return new ResponseEntity<Area>(areaRepository.save(area), HttpStatus.CREATED);
    }
}
