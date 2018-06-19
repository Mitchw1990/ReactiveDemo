package com.example.reactive.demo;

import com.example.reactive.demo.kafka.KafkaConsumer;
import com.example.reactive.demo.kafka.KafkaProducer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class DemoApplication {

    private static final String TOPIC = "demo-topic";

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


//    @PostConstruct
//    public void test() throws Exception {
//        System.out.println("\n\nCONSUMER######\n\n");
//        int count = 20;
//        CountDownLatch latch = new CountDownLatch(count);
//        KafkaConsumer consumer = new KafkaConsumer();
//        consumer.consumeMessages(TOPIC, latch);
//
//        System.out.println("\n\nPRODUCER######\n\n");
//        KafkaProducer producer = new KafkaProducer();
//        producer.sendMessages(TOPIC, count, latch);
//        latch.await(10, TimeUnit.SECONDS);
//        producer.close();
//    }
}