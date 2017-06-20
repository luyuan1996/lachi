package mapper;

import java.util.List;
import pojo.Company;
import pojo.CompanyExample;
import org.apache.ibatis.annotations.Param;

public interface CompanyMapper {
    long countByExample(CompanyExample example);

    int deleteByExample(CompanyExample example);

    int deleteByPrimaryKey(String id);

    int insert(Company record);

    int insertSelective(Company record);

    List<Company> selectByExample(CompanyExample example);

    Company selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyExample example);

    int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);
}