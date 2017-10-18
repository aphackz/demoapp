package au.com.ap.network.demoapp;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"au.com.ap.network.domain"})
@EnableJpaRepositories(basePackages = {"au.com.ap.network.dao"})
public class RepositoryConfiguration {
}
