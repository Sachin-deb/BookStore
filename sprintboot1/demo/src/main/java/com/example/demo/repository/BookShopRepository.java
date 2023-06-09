package com.example.demo.repository;

import com.example.demo.model.BookShop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookShopRepository extends JpaRepository<BookShop, Long> {

}