package com.yonamz.aucsusu.item;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.yonamz.aucsusu.user.User;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;


@Getter @Setter
@Entity
@NoArgsConstructor
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long item_no;

    @Column(length = 100, nullable = false)
    private String title;
    @Column(length = 100, nullable = false)
    private String writer;
    @Column(length = 100, nullable = false)
    private String content;
    @Column(length = 100, nullable = false)
    private int starting_bid;
    @Column(length = 100, nullable = false)
    private Date deadline;
    @Column(length = 100, nullable = false, updatable = false)
    @CreationTimestamp
    private Timestamp reg_date;
    @Column(length = 100, nullable = false, updatable = false)
    private int cnt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;


    @Builder
    public Item(Long item_no, String title, String writer, String content, int starting_bid, Date deadline, Timestamp reg_date, int cnt) {
        this.item_no = item_no;
        this.title = title;
        this.writer = writer;
        this.content = content;
        this.starting_bid = starting_bid;
        this.deadline = deadline;
        this.reg_date=reg_date;
        this.cnt = cnt;
    }

}