package org.cheztone.backend.config;

import com.mongodb.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableMongoRepositories(basePackages = "org.cheztone.backend.repository")
@PropertySource({ "classpath:mongodb-data-source.properties" })
public class DataSourceConfig extends AbstractMongoConfiguration {

    @Autowired
    Environment env;

    @Override
    public String getDatabaseName(){
        return env.getProperty("mongo.database.name");
    }

    @Override
    @Bean
    public Mongo mongo() throws Exception {
        ServerAddress serverAddress = new ServerAddress(env.getProperty("mongo.host"));
        List<MongoCredential> credentials = new ArrayList<>();
        /*credentials.add(MongoCredential.createScramSha1Credential(
                env.getRequiredProperty("mongo.username"),
                env.getRequiredProperty("mongo.name"),
                env.getRequiredProperty("mongo.password").toCharArray()
        ));*/
        MongoClientOptions options = new MongoClientOptions.Builder()
                .build();
        return new MongoClient(serverAddress, credentials, options);
    }

}