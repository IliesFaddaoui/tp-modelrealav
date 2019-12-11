package com.esipe.clemsilies.tpmodrealav.config;

import com.esipe.clemsilies.tpmodrealav.model.EtagEventListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@Configuration
@EnableMongoAuditing
public class MongoConfig {

    @Bean
    public EtagEventListener createEtagEventListener(){
        return new EtagEventListener();
    }
}
