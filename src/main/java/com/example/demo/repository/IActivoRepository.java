package com.example.demo.repository;

import com.example.demo.entity.Activo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IActivoRepository extends JpaRepository<Activo, Long> {
}
