package com.back.bean_aop.domain.wiseeSaying.repository;

import com.back.bean_aop.domain.wiseeSaying.entity.WiseSaying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WiseSayingRepository extends JpaRepository<WiseSaying, Integer> {

}
