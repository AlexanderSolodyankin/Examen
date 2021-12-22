package it.academy.finalexamen.entity;

import lombok.*;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Table(name = "inquiry")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class InquiryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime createDate;
    private String name;

    @PrePersist
    public void prePersistCreateData(){
        this.createDate = LocalDateTime.now();
    }
}
