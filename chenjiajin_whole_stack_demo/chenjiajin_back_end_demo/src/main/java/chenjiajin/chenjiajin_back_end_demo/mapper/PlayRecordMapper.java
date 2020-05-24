package chenjiajin.chenjiajin_back_end_demo.mapper;

import chenjiajin.chenjiajin_back_end_demo.model.entity.PlayRecord;
import org.apache.ibatis.annotations.Param;

public interface PlayRecordMapper {


    int saveRecord(PlayRecord playRecord);

}
