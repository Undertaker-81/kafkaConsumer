package com.example.consumer.service;


import com.example.consumer.dto.PersonDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaService {

    @KafkaListener(topics = "person", groupId = "consumer-1")
    public void listen(PersonDto message) {
       // System.out.println("Received Message in group : " + message);
//        ConsumerRecord<String, Object> consumerRecord = (ConsumerRecord<String, Object>) message;
//        PersonDto personDto = (PersonDto) consumerRecord.value();
        log.info(message.toString());
    }
}
