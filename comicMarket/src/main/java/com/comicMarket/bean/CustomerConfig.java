//package com.comicMarket.bean;
//
//import org.apache.kafka.clients.admin.NewTopic;
//import org.apache.kafka.clients.consumer.KafkaConsumer;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.kafka.support.converter.RecordMessageConverter;
//import org.springframework.kafka.support.converter.StringJsonMessageConverter;
//
//@Configuration
//public class CustomerConfig {
//    private final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);
//
//    //不指定group，默认取spring boot里配置的
//    @KafkaListener(topics = "topic-test",id = "test")
//    public void listen(String mes) {
//        logger.info("我收到的数据是-------------"+mes);
//    }
//
//    @Bean
//    public RecordMessageConverter converter() {
//        return new StringJsonMessageConverter();
//    }
//
//    @Bean
//    public NewTopic topic() {
//        //主题 分区数  副本数
//        return new NewTopic("topic-test", 1, (short) 1);
//    }
//}