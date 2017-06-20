package mapper;

import java.util.List;
import pojo.Usercart;
import pojo.UsercartExample;
import org.apache.ibatis.annotations.Param;

public interface UsercartMapper {
    long countByExample(UsercartExample example);

    int deleteByExample(UsercartExample example);

    int deleteByPrimaryKey(String id);

    int insert(Usercart record);

    int insertSelective(Usercart record);

    List<Usercart> selectByExample(UsercartExample example);

    Usercart selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Usercart record, @Param("example") UsercartExample example);

    int updateByExample(@Param("record") Usercart record, @Param("example") UsercartExample example);

    int updateByPrimaryKeySelective(Usercart record);

    int updateByPrimaryKey(Usercart record);
}