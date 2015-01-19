package beautychu.domain;

import java.io.Serializable;

public class Coupon implements Serializable {

  private static final long serialVersionUID = 1L;
  String licenseeNo;
  String couponCode;
  String endDate;
  String startDate;
  String useDate;
  int discount;
  int cost;
  String cContent;
  String email;
  String email2;
  
  public String getLicenseeNo() {
    return licenseeNo;
  }
  public void setLicenseeNo(String licenseeNo) {
    this.licenseeNo = licenseeNo;
  }
  public String getCouponCode() {
    return couponCode;
  }
  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }
  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }
  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }
  public String getUseDate() {
    return useDate;
  }
  public void setUseDate(String useDate) {
    this.useDate = useDate;
  }
  public int getDiscount() {
    return discount;
  }
  public void setDiscount(int discount) {
    this.discount = discount;
  }
  public int getCost() {
    return cost;
  }
  public void setCost(int cost) {
    this.cost = cost;
  }
  public String getcContent() {
    return cContent;
  }
  public void setcContent(String cContent) {
    this.cContent = cContent;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getEmail2() {
    return email2;
  }
  public void setEmail2(String email2) {
    this.email2 = email2;
  }
  
  
  @Override
  public String toString() {
    return "Coupon [licenseeNo=" + licenseeNo + ", couponCode=" + couponCode
        + ", endDate=" + endDate + ", startDate=" + startDate + ", useDate="
        + useDate + ", discount=" + discount + ", cost=" + cost + ", cContent="
        + cContent + ", email=" + email + ", email2=" + email2 + "]";
  }
  

}
