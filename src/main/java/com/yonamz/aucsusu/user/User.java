package com.yonamz.aucsusu.user;


import com.yonamz.aucsusu.item.Item;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter @Setter
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String uid;

    @Column
    private String name;

    @Column
    private String password;

    @Column
    private String email;

    @Column
    private String phoneNumber;


    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Item> item = new ArrayList<>();



    @Builder
    public User(String uid, String name, String password,String email, String phoneNumber){
        this.uid=uid;
        this.name=name;
        this.password=password;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public void update(String name,String password,String email) {
        this.name=name;
        this.password=password;
        this.email=email;
    }
}
