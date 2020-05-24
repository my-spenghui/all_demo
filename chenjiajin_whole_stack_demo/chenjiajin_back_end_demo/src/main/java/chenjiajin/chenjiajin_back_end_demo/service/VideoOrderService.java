package chenjiajin.chenjiajin_back_end_demo.service;


import chenjiajin.chenjiajin_back_end_demo.model.entity.VideoOrder;

import java.util.List;

public interface VideoOrderService {


    int save(int userId, int videoId);

    List<VideoOrder> listOrderByUserId(Integer userId);
}
