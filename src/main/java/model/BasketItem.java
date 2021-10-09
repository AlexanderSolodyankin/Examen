package model;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "basket_item")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BasketItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @JoinColumn(name = "product_count")
    private List<Product> productCount;

    @OneToOne
    @JoinColumn(name = "basket_id")
    private Basket basketId;
}
