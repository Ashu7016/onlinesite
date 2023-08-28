package com.Onlinesite.java.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OnlineEntity {
    @Id
    private long batId;
    private String batName;
    private int batPrice;
}
