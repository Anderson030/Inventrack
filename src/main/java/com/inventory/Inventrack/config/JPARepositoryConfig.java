package com.inventory.Inventrack.config;

import com.inventory.Inventrack.domain.repository.interfaces.GenericRepository;
import com.inventory.Inventrack.domain.repository.JPAImpl.JPARepositoryGenericImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;

@Configuration
public class JPARepositoryConfig {

    @Bean
    @Primary
    public <T, ID> GenericRepository<T, ID> genericRepository(JpaRepository<T, ID> jpaRepository) {
        return new JPARepositoryGenericImpl<>(jpaRepository);
    }
}
