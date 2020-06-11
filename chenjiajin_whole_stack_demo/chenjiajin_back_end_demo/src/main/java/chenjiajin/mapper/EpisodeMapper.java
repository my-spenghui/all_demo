package chenjiajin.mapper;

import chenjiajin.model.entity.Episode;
import org.apache.ibatis.annotations.Param;

public interface EpisodeMapper {


    Episode findFirstEpisodeByVideoId(@Param("video_id") int videoId);

}
