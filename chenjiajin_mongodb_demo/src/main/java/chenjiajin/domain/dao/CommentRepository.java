package chenjiajin.domain.dao;

import chenjiajin.domain.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository extends MongoRepository<Comment,String> {

    //分页查询固定写法，findBy属性的具体字段名  findBy的后面跟的字段名要存储的字段名一模一样
    Page<Comment> findByParentid(String parentid, Pageable pageable);

}
