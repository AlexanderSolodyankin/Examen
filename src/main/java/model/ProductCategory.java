package model;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "product_category")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "category_id")
    private Category categoryId;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product productId;

}
