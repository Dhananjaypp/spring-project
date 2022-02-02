package com.example.TryNew.MyMapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface myMapper {

	@Select("SELECT value FROM public.\"result_table\" where \"kpi_name\"='${steam}';")
	Double hrsg1table1(String steam);  
	

}
