package net.codejava.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity(name = "orders")
@Table(name = "orders")
public class Order {
    @Id
    @SequenceGenerator(name = "order_seq",sequenceName = "order_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "order_seq")
    private Long order_id;
    private double total_price;

    private Date order_date;
//    private ArrayList<Product> orderProducts;

    @ManyToOne
    @JoinColumn(name = "userId",referencedColumnName = "id")
    private User user;
}
