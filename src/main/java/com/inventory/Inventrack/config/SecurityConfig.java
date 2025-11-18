package com.inventory.Inventrack.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        // Ajusta EXACTAMENTE a tus rutas reales
                        .requestMatchers("/product/**").permitAll()
                        // Si usas prefijo /api:
                        // .requestMatchers("/api/product/**").permitAll()

                        // Si solo quieres permitir GET público y proteger POST/PUT/DELETE:
                        // .requestMatchers(HttpMethod.GET, "/product/**").permitAll()

                        .requestMatchers("/", "/css/**", "/js/**", "/images/**").permitAll()
                        .anyRequest().authenticated()
                );
        return http.build();
    }
}