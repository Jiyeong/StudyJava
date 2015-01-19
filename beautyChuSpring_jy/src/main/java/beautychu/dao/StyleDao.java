package beautychu.dao;

import java.util.List;

import beautychu.domain.Style;

public interface StyleDao {
	
	  List<?> getList();
	  /*Style existUser(Map<String,String> params);*/
	  void insertStyle(Style style);

	}