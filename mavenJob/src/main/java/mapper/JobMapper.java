package mapper;

import java.util.List;
import pojo.Job;
import pojo.JobExample;
import org.apache.ibatis.annotations.Param;

public interface JobMapper {
    long countByExample(JobExample example);

    int deleteByExample(JobExample example);

    int deleteByPrimaryKey(String id);

    int insert(Job record);

    int insertSelective(Job record);

    List<Job> selectByExample(JobExample example);

    Job selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Job record, @Param("example") JobExample example);

    int updateByExample(@Param("record") Job record, @Param("example") JobExample example);

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);
}