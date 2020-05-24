package chenjiajin.chenjiajin_back_end_demo.service;


import chenjiajin.chenjiajin_back_end_demo.model.entity.Video;
import chenjiajin.chenjiajin_back_end_demo.model.entity.VideoBanner;

import java.util.List;

public interface VideoService {

    List<Video> listVideo();

    List<VideoBanner> listBanner();

    Video findDetailById(int videoId);
}
