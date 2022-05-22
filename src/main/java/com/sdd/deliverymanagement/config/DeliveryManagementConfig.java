package com.sdd.deliverymanagement.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@Configuration
@EntityScan(basePackages = {"com.sdd.deliverymanagement.entity"})
@EnableJpaRepositories(basePackages = {"com.sdd.deliverymanagement.repository"})
@ComponentScan({"com.sdd.deliverymanagement.service","com.sdd.deliverymanagement.service.impl","com.sdd.deliverymanagement.util.handler"})
public class DeliveryManagementConfig {

    @Bean
    public ReloadableResourceBundleMessageSource messageSource(){
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:i18n/messages");
        messageSource.setCacheSeconds(3600);
        return messageSource;
    }
}
