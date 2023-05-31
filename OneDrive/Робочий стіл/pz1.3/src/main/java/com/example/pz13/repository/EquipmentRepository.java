package com.example.pz13.repository;

import com.example.pz13.model.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository <Equipment, Long> {
}
