package com.nology.benches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BenchesService {
    @Autowired
    BenchesRepository benchesRepository;

    // CREATE
    public void addBench(Bench bench) {
        benchesRepository.addBench(bench);
    }

    // READ

    public Bench getBenchById(long id) {
        if(!benchesRepository.hasBench(id)){
            throw new BenchNotFoundException();
        }
        return benchesRepository.getBenchById(id);
    }

    public Bench getRandomBench() {
        return benchesRepository.getRandomBench();
    }

    public List<Bench> getAllBenches(int limit) {
        return benchesRepository.getAllBenches().stream().limit(limit).collect(Collectors.toList());
    }

    //potentially unnecessary for my purposes
    public List<Long> getBenchesIds(){
        List<Bench> benches = benchesRepository.getAllBenches();
        List<Long> benchesIds = benches.stream().map(bench -> bench.getId()).collect(Collectors.toList());
        return benchesIds;
    }

    public List<Bench> getBenchByOpening(boolean isTwentyFourHr, int limit){
        List<Bench> benches = benchesRepository.getAllBenches();
        return benches.stream().filter(bench -> bench.isTwentyFourHourAccess()).limit(limit).collect(Collectors.toList());
    }

    // UPDATE
    public void updateBench(Bench newBench, int id) {
        if(!benchesRepository.hasBench(id)){
            throw new BenchNotFoundException();
        }
        benchesRepository.updateBench(newBench, id);
    }

    // DELETE
    public void deleteBenchById(int id) {
        if(!benchesRepository.hasBench(id)){
            throw new BenchNotFoundException();
        }
        benchesRepository.deleteBenchById(id);
    }
    }
