package com.nology.benches;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BenchesRepository extends JpaRepository<Bench, Long> {

    void deleteBenchById(long id);
}
