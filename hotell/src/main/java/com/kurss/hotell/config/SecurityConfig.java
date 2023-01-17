package com.kurss.hotell.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeHttpRequests((requests) -> requests
                        .mvcMatchers("/", "/rooms","/price","/blog", "/blog/details/**", "/registration", "/error-not-found").permitAll()
                        .mvcMatchers("/user", "/blog/details/**", "/book").hasAnyRole("USER", "ADMIN")
                        .mvcMatchers("/manager", "/clients","/blog/**", "/question/**", "/reserve/**", "/book").hasAnyRole("MANAGER", "ADMIN")
                        .mvcMatchers("/admin","/user-controller/**", "/special", "/clients","/blog/**", "/question/**", "/reserve/**", "/book").hasAnyRole("ADMIN")

                )
                .formLogin((form) -> form
                        .loginPage("/login")
                        .permitAll()
                )
                .logout((logout) -> logout.permitAll());

        return http.build();
    }

    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return new BCryptPasswordEncoder(10);
    }
}

