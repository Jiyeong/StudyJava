package beautychu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import beautychu.dao.CustomerDao;
import beautychu.domain.Customer;

@Service
public class CustomerService {
  @Autowired
  CustomerDao customerDao;
  
  public List<?> cCouponList() {
    return customerDao.cCouponList();
  }
  
  public void updatePhoto(Customer customer) {
    customerDao.updatePhoto(customer);
  }
  
  public void receiveCoupon(Customer customer) {
    customerDao.receiveCoupon(customer);
  }
}
