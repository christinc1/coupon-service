package com.chris.learn.springcloud.couponservice.repository;

import com.chris.learn.springcloud.couponservice.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon, Long> {

    Coupon findByCode(String coupon);
}
