package com.bezkoder.spring.login.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "preApprovedPictures")
@Entity

public class PreApprovedPictures {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 12)
    private Category category;
@Column(nullable = false, length = 2000)
    private String description;
@Column(nullable = false, length = 255)
    private String photoName;

}
