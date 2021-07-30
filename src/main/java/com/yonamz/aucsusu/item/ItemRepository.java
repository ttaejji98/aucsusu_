package com.yonamz.aucsusu.item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ItemRepository extends JpaRepository<Item, Long> {

    @Modifying
    @Query("update Item i set i.cnt = i.cnt + 1 where i.item_no = :item_no")
    int updateCount(@Param("item_no") Long item_no);

    @Query("select item from Item item where item.item_no = :item_no")
    Item findByItem_no(@Param("item_no") Long item_no);
}
