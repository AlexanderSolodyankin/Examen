package model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "orders_method")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrdersMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String method;
}
