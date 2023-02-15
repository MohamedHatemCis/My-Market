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
@Entity(name = "users")
@Table(name = "users")
public class User {
    @Id
    @SequenceGenerator(name = "user_seq",sequenceName = "user_seq",allocationSize = 1)
    @GeneratedValue(generator = "user_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String username;
    private String password;


    User(String username,String password){
        this.username=username;
        this.password=password;
    }
}
