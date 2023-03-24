package com.nology.benches;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Random;

@Repository
public class BenchesRepository {

    private ArrayList<Bench> benches = new ArrayList<>();

    public void addBench(Bench bench) {
        benches.add(bench);
    }

    public Bench getBenchById(Long id){
        for (Bench bench : benches) {
            if (bench.getId() == id) {
                return bench;
            }
        }
        return null;
    }

    public ArrayList<Bench> getAllBenches(){
        return benches;
    }

    public Bench getRandomBench() {
        Random random = new Random();
        return benches.get(random.nextInt(benches.size()));
    }

    public boolean deleteBenchById(@PathVariable int id) {

        if (id < benches.size() && id >= 0) {
            benches.remove(id);
            return true;
        }
        return false;
    }
}
