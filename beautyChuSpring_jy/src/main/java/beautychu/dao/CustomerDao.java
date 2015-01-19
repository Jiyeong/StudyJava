package beautychu.dao;

import java.util.List;

import beautychu.domain.Customer;

public interface CustomerDao {

  public List<?> cCouponList();
  void updatePhoto(Customer customer);
  void receiveCoupon(Customer customer);
  
  
}
