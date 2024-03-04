package com.example.model.controllers;


import com.example.model.dto.CIModuleDto;
import com.example.model.services.CIModuleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CIModuleController {
    private final CIModuleService ciModuleService;


    public CIModuleController(CIModuleService ciModuleService) {
        this.ciModuleService = ciModuleService;
    }

    @GetMapping("/cimodules")
    public List<CIModuleDto> getAllCIModules() {

        List<CIModuleDto> dtos = ciModuleService.getAllCIModules();

        return dtos;
    }

    @GetMapping("/cimodules/{id}")
    public CIModuleDto getCIModule(@PathVariable("id") Long id) {

        CIModuleDto ciModuleDto = ciModuleService.getCIModule(id);

        return ciModuleDto;
    }

    @PostMapping("/cimodules")
    public CIModuleDto addCIModule(@RequestBody CIModuleDto dto) {
        CIModuleDto ciModuleDto = ciModuleService.addCIModule(dto);
        return ciModuleDto;
    }

    @DeleteMapping("/cimodules/{id}")
    public void deleteCIModule(@PathVariable("id") Long id) {
        ciModuleService.deleteCIModule(id);
    }

    @PutMapping("/cimodules/{id}")
    public CIModuleDto updateCIModule(@PathVariable("id") Long id, @RequestBody CIModuleDto ciModuleDto) {
        ciModuleService.updateCIModule(id, ciModuleDto);
        return ciModuleDto;
    }

}
