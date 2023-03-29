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
                String address1 = (String) benchJSON.get("address1");
                String address2 = (String) benchJSON.get("address2");
                String city = (String) benchJSON.get("city");
                String postcode = (String) benchJSON.get("postcode");
                boolean twentyFourHourAccess = (boolean) benchJSON.get("twenty_four_hour");
                String view = (String) benchJSON.get("view");
                boolean accessibility = (boolean) benchJSON.get("accessibility");
                long capacity = (long) benchJSON.get("capacity");
                String engravedMessage = (String) benchJSON.get("engraved_message");
                boolean memorialBench = (boolean) benchJSON.get("memorial_bench");
                boolean shaded = (boolean) benchJSON.get("shaded");
                boolean picnicTable = (boolean) benchJSON.get("picnic_table");
                String openingTime = (String) benchJSON.get("opening_time");
                String closingTime = (String) benchJSON.get("closing_time");


                benchesRepository.addBench((new Bench(id,address1,address2,city,postcode,twentyFourHourAccess,view,accessibility,capacity,engravedMessage,memorialBench,shaded, picnicTable, openingTime, closingTime)));
            }
        } catch (Exception e) {
                e.printStackTrace();
        }
    }
}
