package chenjiajin.chenjiajin_back_end_demo.mapper;

import chenjiajin.chenjiajin_back_end_demo.model.entity.Episode;
import org.apache.ibatis.annotations.Param;

public interface EpisodeMapper {


    Episode findFirstEpisodeByVideoId(@Param("video_id") int videoId);

}
