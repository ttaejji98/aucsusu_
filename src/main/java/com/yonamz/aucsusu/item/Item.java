package com.yonamz.aucsusu.item;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;


@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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
    @Column
    @CreationTimestamp
    private Timestamp reg_date;
    @Column(length = 100, nullable = false)
    private int cnt;

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