package com.nology.benches;

public class BenchNotFoundException extends RuntimeException{
    public BenchNotFoundException() {
        super("Bench has not been found");
    }

}
