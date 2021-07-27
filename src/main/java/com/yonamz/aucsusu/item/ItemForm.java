package com.yonamz.aucsusu.item;

import com.yonamz.aucsusu.user.User;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemForm {

    private Long item_no;
    private String writer;
    private String title;
    private String content;
    private Date deadline;
    private int starting_bid;
    private Timestamp reg_date;
    private String picture_url;
    private int cnt;

    public Item toEntity(String sessionUser){
        Item build = Item.builder()
                .item_no(item_no)
                .writer(sessionUser)
                .title(title)
                .content(content)
                .starting_bid(starting_bid)
                .deadline(deadline)
                .reg_date(reg_date)
                .cnt(cnt)
                .build();
        return build;
    }

    @Builder
    public ItemForm(Long item_no, String writer, String title, String content, Date deadline, int starting_bid, Timestamp reg_date, int cnt) {

        this.item_no = item_no;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.deadline = deadline;
        this.starting_bid = starting_bid;
        this.reg_date=reg_date;
        this.cnt = cnt;
    }

}