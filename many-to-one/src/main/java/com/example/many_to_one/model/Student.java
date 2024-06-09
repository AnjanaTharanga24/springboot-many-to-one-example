package com.example.many_to_one.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    private Long sId;
    private String sName;

    @ManyToOne
    @JoinColumn(name = "bidFK")
    private Book book;
}
