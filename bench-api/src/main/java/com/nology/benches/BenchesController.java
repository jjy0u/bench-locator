package com.nology.benches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BenchesController {
    @Autowired
    BenchesRepository benchesRepository;

    @GetMapping("/benches")
    public List<Bench> getBenches() {
        return benchesRepository.getAllBenches();
    }

    @GetMapping("/benches/{id}")
    public Bench getBenchById(@PathVariable long id){
        return benchesRepository.getBenchById(id);
    }

    @GetMapping("/benches/random")
    public Bench getRandomBench() {
        return benchesRepository.getRandomBench();
    }

    @DeleteMapping("/benches/{id}")
    public boolean deleteBenchById(@PathVariable int id) {
        return benchesRepository.deleteBenchById(id);
    }
}
