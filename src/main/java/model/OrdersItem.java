package model;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders_item")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrdersItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product productId;

    @OneToMany
    @JoinColumn(name = "product_count")
    private List<Product> productsCount;


    @OneToOne
    @JoinColumn(name = "orders_id")
    private Orders orders;
}
