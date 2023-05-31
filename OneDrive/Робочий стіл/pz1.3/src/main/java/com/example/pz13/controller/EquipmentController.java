package com.example.pz13.controller;

import com.example.pz13.model.Equipment;
import com.example.pz13.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EquipmentController {

    @Autowired
    private EquipmentRepository repository;

    @GetMapping("/")
    public String getAllEquipment(Model model){
        List<Equipment> equipments = repository.findAll();
        model.addAttribute("equipments",equipments);
        return "index";
    }

    @PostMapping(value = "/add")
    public String saveProduct(@ModelAttribute("equipment")Equipment equipment){
        repository.save(equipment);
        return "redirect:/";
    }
}
