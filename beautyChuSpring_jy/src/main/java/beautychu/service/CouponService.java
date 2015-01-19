package beautychu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import beautychu.dao.CouponDao;

@Service
public class CouponService {
  @Autowired
  CouponDao couponDao;


public void makeCoupon(Coupon coupon) {
  couponDao.makeCoupon(coupon);
}

}
