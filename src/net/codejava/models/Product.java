package net.codejava.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Product {
    @Id
    @SequenceGenerator(name = "product_seq",sequenceName = "product_seq",allocationSize = 1)
    @GeneratedValue(generator = "product_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private int quantity;
    private double price;
    private String imgUrl;
}
