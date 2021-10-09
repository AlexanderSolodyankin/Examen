package model;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;

    @OneToMany
    @JoinColumn(name = "orders_methods_id")
    private List<OrdersMethod> ordersMethod;

    @OneToOne
    @JoinColumn(name = "payment_method")
    private PaymentMethod paymentMethod;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
}
