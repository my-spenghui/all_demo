package chenjiajin.service;


import chenjiajin.model.entity.Video;
import chenjiajin.model.entity.VideoBanner;

import java.util.List;

public interface VideoService {

    List<Video> listVideo();

    List<VideoBanner> listBanner();

    Video findDetailById(int videoId);
}
