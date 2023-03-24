package com.nology.benches;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.FileReader;

@Component
public class BenchesInitialiser {
    private final BenchesRepository benchesRepository;

    @Value("classpath:benches.json")
    private Resource resourceFile;

    @Autowired
    public BenchesInitialiser(BenchesRepository benchesRepository) {
        this.benchesRepository = benchesRepository;
    }

    @PostConstruct
    public void init() {
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader(resourceFile.getFile())) {
            Object obj = jsonParser.parse(reader);

            JSONArray jsonArray = (JSONArray) obj;

            for (Object bench : jsonArray) {
                JSONObject benchJSON = (JSONObject) bench;

                long id = (long) benchJSON.get("id");
                String address = (String) benchJSON.get("address");
                String city = (String) benchJSON.get("city");
                String postcode = (String) benchJSON.get("postcode");
                boolean twentyFourHourAccess = (boolean) benchJSON.get("twenty_four_hour");
                String view = (String) benchJSON.get("view");
                boolean accessibility = (boolean) benchJSON.get("accessibility");
                long capacity = (long) benchJSON.get("capacity");
                String engravedMessage = (String) benchJSON.get("engraved_message");
                boolean memorialBench = (boolean) benchJSON.get("memorial_bench");

                benchesRepository.addBench((new Bench(id,address,city,postcode,twentyFourHourAccess,view,accessibility,capacity,engravedMessage,memorialBench)));
            }
        } catch (Exception e) {
                e.printStackTrace();
        }
    }
}
