package com.example.demo.service;

import com.example.demo.entity.Area;
import com.example.demo.repository.IAreaRepository;

import java.util.List;

public class AreaServiceImpl implements IAreaService{

    private IAreaRepository areaRepository;
    @Override
    public Area saveArea(Area area) {
        return null;
    }

    @Override
    public List<Area> listArea() {
        return areaRepository.findAll();
    }
}
