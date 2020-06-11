package chenjiajin.service;


import chenjiajin.model.entity.VideoOrder;

import java.util.List;

public interface VideoOrderService {


    int save(int userId, int videoId);

    List<VideoOrder> listOrderByUserId(Integer userId);
}
