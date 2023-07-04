package com.chy.common.rabbit.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: cuihongyuan
 * @Date: 2023/3/23 0023 - 03 - 23 - 10:36
 * @Description: com.chy.common.rabbit.config
 * @version: 1.0
 */


@Configuration
public class MQConfig {
    @Bean
    public MessageConverter messageConverter(){
        return new Jackson2JsonMessageConverter();
    }
}

