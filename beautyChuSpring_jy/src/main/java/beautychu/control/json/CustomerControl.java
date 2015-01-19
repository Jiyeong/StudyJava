package beautychu.control.json;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import beautychu.domain.Customer;
import beautychu.service.CustomerService;

@Controller("json.customerControl")
@RequestMapping("/json/customer")
public class CustomerControl {
  
  @Autowired
  CustomerService customerService;
  
  @RequestMapping("/updatePhoto")
  public Object updatePhoto(String email, String profilePhoto)throws Exception {
    Customer customer = new Customer();
    customer.setEmail(email);
    customer.setProfilePhoto(profilePhoto);
    customerService.updatePhoto(customer);
    
    HashMap<String, Object> resultMap = new HashMap<>();
    resultMap.put("status", "success");
    //resultMap.put("customerPhoto", customerService.updatePhoto(customer));
    return resultMap;
  }
  
  @RequestMapping("/receiveCoupon")
  public Object receiveCoupon()throws Exception {
    
    HashMap<String, Object> resultMap = new HashMap<>();
    resultMap.put("cCouponList", customerService.cCouponList());
    return resultMap;
  }
}

