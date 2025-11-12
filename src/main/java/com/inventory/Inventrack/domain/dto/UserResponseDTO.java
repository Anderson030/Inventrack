package com.inventory.Inventrack.domain.dto;

import java.time.LocalDateTime;

public class UserResponseDTO {
    private Long id;
    private String name;
    private String hash_password;
    private String role;
    private boolean active;
    private LocalDateTime created_at;
}
