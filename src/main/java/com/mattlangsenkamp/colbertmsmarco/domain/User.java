package com.mattlangsenkamp.colbertmsmarco.domain;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.data.annotation.Id;

public record User(@Id Integer id,
        String email,
        Optional<String> password,
        LocalDateTime dateCreated,
        Provider provider) {
}
