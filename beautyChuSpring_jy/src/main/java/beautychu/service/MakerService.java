package beautychu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import beautychu.dao.MakerDao;

@Service
public class MakerService {
  @Autowired MakerDao makerDao;
  
/*  public List<Maker> getList() {
    return makerDao.selectNameList(); 
  }*/
}







