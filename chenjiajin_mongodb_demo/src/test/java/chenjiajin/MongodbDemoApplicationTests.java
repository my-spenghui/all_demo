//package chenjiajin;
//
//import chenjiajin.domain.Comment;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.core.query.Criteria;
//import org.springframework.data.mongodb.core.query.Query;
//import org.springframework.data.mongodb.core.query.Update;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//
//@SpringBootTest(classes = MongodbDemoApplication.class)
//@RunWith(SpringRunner.class)
//class MongodbDemoApplicationTests {
//
//    @Autowired
//    private CommentService commentService;
//    @Autowired
//    private MongoTemplate mongoTemplate;
//
//    @Test
//    public void testFindCommentList() {
//        List<Comment> list = commentService.findCommentList();
//        System.out.println(list);
//    }
//    @Test
//    public void updateCommentLikenum(){
//        //查询条件 根据_id去查询
//        Query query = Query.query(Criteria.where("_id").is("3"));
//        //更新条件
//        Update update = new Update();
//        update.inc("likenum");
//        mongoTemplate.updateFirst(query,update,Comment.class);
//    }
//
//    /**
//     * 保存一条数据
//     */
//    @Test
//    public void saveDoc(){
//        Comment comment = new Comment();
//        comment.put("name","陈嘉劲");
//        comment.put("_id","123");
//        mongoTemplate.save(comment,"comment");
//    }
//
//}
