package com.example.demo.service;

import com.example.demo.entity.Area;

import java.util.List;

public interface IAreaService {
    Area saveArea(Area area);
    List<Area> listArea();
}
