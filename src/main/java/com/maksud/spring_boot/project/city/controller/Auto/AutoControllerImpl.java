package com.maksud.spring_boot.project.city.controller.Auto;


import com.maksud.spring_boot.project.city.Dto.AutoResponse;
import com.maksud.spring_boot.project.city.model.Auto;
import com.maksud.spring_boot.project.city.service.auto.AutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class AutoControllerImpl implements AutoController {
private final AutoService autoService;

@GetMapping("/auto/{id}")
public Auto getAutoById(@PathVariable  Long id){
    return autoService.getAutoById(id);
}

    @Override
    @PostMapping("/createAuto")
    public void addAuto(@RequestBody Auto auto) {
        autoService.addAuto(auto);
    }

    @Override
    @GetMapping("user/{id}/auto")
    public AutoResponse getAutosByIdUser(Long id) {
        return autoService.getAutosByIdUser(id);
    }
}