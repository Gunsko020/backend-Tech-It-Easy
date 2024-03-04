package com.example.model.controllers;


import com.example.model.dto.WallBracketDto;
import com.example.model.services.WallBracketService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class WallBracketController {
    private final WallBracketService wallBracketService;

    public WallBracketController(WallBracketService wallBracketService) {
        this.wallBracketService = wallBracketService;
    }

    @GetMapping("/wallbrackets")
    public List<WallBracketDto> getAllWallBrackets() {

        List<WallBracketDto> wallBrackets = wallBracketService.getAllWallBrackets();

        return wallBrackets;
    }

    @GetMapping("/wallbrackets/{id}")
    public WallBracketDto getWallBracket(@PathVariable("id") Long id) {

        WallBracketDto wallBracketDto = wallBracketService.getWallBracket(id);

        return wallBracketDto;
    }

    @PostMapping("/wallbrackets")
    public WallBracketDto addWallBracket(@RequestBody WallBracketDto dto) {
        WallBracketDto wallBracket = wallBracketService.addWallbracket(dto);
        return wallBracket;
    }

    @DeleteMapping("/wallbrackets/{id}")
    public void deleteWallBracket(@PathVariable("id") Long id) {
        wallBracketService.deleteWallBracket(id);
    }

    @PutMapping("/wallbrackets/{id}")
    public WallBracketDto updateWallBracket(@PathVariable("id") Long id, @RequestBody WallBracketDto dto) {
        wallBracketService.updateWallBracket(id, dto);
        return dto;
    }


//    @GetMapping("/wallbrackets/televisions/{wallBracketId}")
//    public Collection<TelevisionDto> getTelevisionsByWallBracketId(@PathVariable("wallBracketId") Long wallBracketId){
//        return televisionWallBracketService.getTelevisionsByWallBracketId(wallBracketId);
//    }

}
