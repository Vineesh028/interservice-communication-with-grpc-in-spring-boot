package com.company.service.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.google.common.collect.Lists;

@Configuration
public class MessageConverter extends WebMvcConfigurationSupport {

    @Bean
    public ProtobufHttpMessageConverter protobufHttpMessageConverter() {
        ProtobufHttpMessageConverter protobufHttpMessageConverter = new ProtobufHttpMessageConverter();
        protobufHttpMessageConverter.setSupportedMediaTypes(Lists.newArrayList(MediaType.APPLICATION_JSON,
                MediaType.parseMediaType(MediaType.TEXT_PLAIN_VALUE + ";charset=ISO-8859-1")));
        return protobufHttpMessageConverter;
    }

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(0, protobufHttpMessageConverter());
    }
}