package mapper;

import java.util.List;
import pojo.Resume;
import pojo.ResumeExample;
import org.apache.ibatis.annotations.Param;

public interface ResumeMapper {
    long countByExample(ResumeExample example);

    int deleteByExample(ResumeExample example);

    int deleteByPrimaryKey(String id);

    int insert(Resume record);

    int insertSelective(Resume record);

    List<Resume> selectByExample(ResumeExample example);

    Resume selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Resume record, @Param("example") ResumeExample example);

    int updateByExample(@Param("record") Resume record, @Param("example") ResumeExample example);

    int updateByPrimaryKeySelective(Resume record);

    int updateByPrimaryKey(Resume record);
}