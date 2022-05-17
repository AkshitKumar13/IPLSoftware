package com.service;
import com.google.gson.Gson;
import com.model.JsonModel;
import com.model.MatchModel;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


/**
 * The type Producer service.
 */
@Service
public class ProducerService {
    /**
     * The constant topic.
     */
    public static final String topic = "mytopic";

    /**
     * The Kafkatemplate.
     */
    @Autowired
        KafkaTemplate<String, String> Kafkatemplate;


    /**
     * Publish to topic string.
     *
     * @param item the item
     * @return the string
     */
    public String publishToTopic (MatchModel item) {
        JsonModel model = new JsonModel();
        model.setId((long) item.getMatchid());
        model.setScheduledate(item.getScheduledate());
        model.setVenue(item.getVenue());
        model.setResult(item.getResult());

        Kafkatemplate.send(topic, new Gson().toJson( model));
        return topic;
    }
    }
