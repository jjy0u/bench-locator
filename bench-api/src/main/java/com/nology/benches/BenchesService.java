package com.nology.benches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BenchesService {
    @Autowired
    BenchesRepository benchesRepository;

    // CREATE
    public void addBench(Bench bench) {
        benchesRepository.save(bench);
    }

    // READ

    public Bench getBenchById(long id) {
        if(!benchesRepository.existsById(id)){
            throw new BenchNotFoundException();
        }
        return benchesRepository.getById(id);
    }

    public Bench getRandomBench() {
        List<Bench> benches = benchesRepository.findAll();
        return benches.get((int) (Math.random()*benches.size()));
    }

    public List<Bench> getAllBenches(int limit) {
        return benchesRepository.findAll().stream().limit(limit).collect(Collectors.toList());
    }

    //potentially unnecessary for my purposes
    public List<Long> getBenchesIds(){
        List<Bench> benches = benchesRepository.findAll();
        List<Long> benchesIds = benches.stream().map(bench -> bench.getId()).collect(Collectors.toList());
        return benchesIds;
    }

    public List<Bench> getBenchByOpening(boolean isTwentyFourHr, int limit){
        List<Bench> benches = benchesRepository.findAll();
        return benches.stream().filter(bench -> bench.isTwentyFourHourAccess()).limit(limit).collect(Collectors.toList());
    }

    // UPDATE
    public void updateBench(Bench newBench, int id) {
        if(!benchesRepository.existsById((long) id)){
            throw new BenchNotFoundException();
        }
        newBench.setId(id);
        benchesRepository.save(newBench);
    }

    // DELETE
    @Transactional
    public void deleteBenchById(int id) {
        if(!benchesRepository.existsById((long) id)){
            throw new BenchNotFoundException();
        }

        benchesRepository.deleteBenchById(id);
    }
    }
