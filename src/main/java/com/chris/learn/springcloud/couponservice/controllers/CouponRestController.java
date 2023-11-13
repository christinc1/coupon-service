package com.chris.learn.springcloud.couponservice.controllers;

import com.chris.learn.springcloud.couponservice.model.Coupon;
import com.chris.learn.springcloud.couponservice.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coupons")
public class CouponRestController {

    @Autowired
    CouponRepository couponRepository;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Coupon coupon) {
        return ResponseEntity.ok(couponRepository.save(coupon));
    }

    @GetMapping("/{code}")
    public ResponseEntity<?> getCoupon(@PathVariable("code") String coupon) {
        return ResponseEntity.ok(couponRepository.findByCode(coupon));
    }
}
