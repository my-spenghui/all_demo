package chenjiajin;

import chenjiajin.domain.Comment;
import chenjiajin.domain.service.CommentService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(classes = MongodbDemoApplication.class)
@RunWith(SpringRunner.class)
class MongodbDemoApplicationTests {

    @Autowired
    private CommentService commentService;

    @Test
    public void testFindCommentList() {
        List<Comment> list = commentService.findCommentList();
        System.out.println(list);
    }

}
