package com.nology.benches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BenchesController {
    @Autowired
    BenchesService benchesService;

    @GetMapping("/benches")
    public List<Bench> getBenches(@RequestParam(required = false) boolean isTwentyFourHr, @RequestParam(defaultValue = "5") int limit) {
        if (isTwentyFourHr) {
            return benchesService.getBenchByOpening(true, limit);
        }
        return benchesService.getAllBenches(limit);
    }

    @PostMapping("/bench")
    public ResponseEntity<Bench> createBench(@RequestBody Bench bench){
        benchesService.addBench(bench);
        return ResponseEntity.status(HttpStatus.CREATED).body(bench);
    }

    @PostMapping("/benches")
    public String addBenches(@RequestBody List<Bench> benches) {
        for (Bench bench: benches) {
            benchesService.addBench(bench);
        }
        return "benches added!";
    }

    @GetMapping("/benches/{id}")
    public Bench getBenchById(@PathVariable long id){
        return benchesService.getBenchById(id);
    }

    @GetMapping("/benches/random")
    public Bench getRandomBench() {
        return benchesService.getRandomBench();
    }

    @DeleteMapping("/benches/{id}")
    public String deleteBenchById(@PathVariable int id) {
        benchesService.deleteBenchById(id);
        return "Deleted Bench";
    }
}
