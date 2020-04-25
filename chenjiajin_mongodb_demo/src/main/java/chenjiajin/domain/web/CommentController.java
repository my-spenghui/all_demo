package chenjiajin.domain.web;

import chenjiajin.domain.Comment;
import chenjiajin.domain.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("mongodb")
public class CommentController {
    @Autowired
    private CommentService commentService;

    /**
     * 查询全部数据
     * @return
     */
    @GetMapping("get_all")
    public Object getAll(){
        Map<String,Object> map = new HashMap<>();
        map.put("id",null);
        return commentService.findCommentList();
    }
    /**
     * 保存一个评论
     * @return
     */
    @GetMapping("save_comment")
    public Object saveComment(String id,String parentid){
        Comment comment = new Comment();
        comment.put("阿萨德","动态添加的1");
        comment.put("吃的","动态添加的2");
        comment.put("爱的","动态添加的3");
        comment.put("吃是线程啊","动态添加的123");
        comment.put("爱的我去","动态添加的12312");
        comment.put("川藏线为","动态添加的1112");
        comment.put("穿鞋子擦的","动态添加的223");
        comment.put("_id",id);
        comment.put("parentid",parentid);
        commentService.saveComment(comment);
        return "ok";
    }
    /**
     * 根据id查询单个
     * @return
     */
    @GetMapping("get_one")
    public Object getOne(String id){
        Comment comment = commentService.findCommentById(id);
        return comment;
    }

    @GetMapping("find_by_praentid")
    public Object getOne(String id,int page,int pageSize){
        Page<Comment> pages;

        pages = commentService.findCommentListByParentid(id,page,pageSize);
        System.out.println(pages.getTotalElements());
        System.out.println(pages.getContent());
        return pages;
    }
}
