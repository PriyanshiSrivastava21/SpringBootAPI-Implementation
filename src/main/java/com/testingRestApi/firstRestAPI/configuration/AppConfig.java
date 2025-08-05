package com.testingRestApi.firstRestAPI.configuration;
import com.testingRestApi.firstRestAPI.DBInterface;
import com.testingRestApi.firstRestAPI.DevDB;
import com.testingRestApi.firstRestAPI.ProdDB;
import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    //basically applies object
    @Bean
    @ConditionalOnProperty(name="project.mode",havingValue = "production")
    public DBInterface getProdBean(){
        return new ProdDB();
    }
    @Bean
    @ConditionalOnProperty(name="project.mode",havingValue = "development")
    public DBInterface getDevBean(){
        return new DevDB();
    }

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }
}
