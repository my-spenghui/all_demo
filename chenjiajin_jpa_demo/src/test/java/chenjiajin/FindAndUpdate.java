package chenjiajin;

import chenjiajin.dao.UsersRepository;
import chenjiajin.entity.Users;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * 查找和新增
 */

@SpringBootTest(classes = ChenjiajinJpaDemoApplication.class)
@RunWith(SpringRunner.class)
class FindAndUpdate {

    @Autowired
    private UsersRepository usersRepository;

    /**
     * 直接用内置方法新增
     */
    @Test
    void testSave(){
        Users users = new Users();
        users.setAddress("后库");
        users.setAge(66);
        users.setName("滴滴");
        System.out.println(this.usersRepository.save(users));
    }

    /**
     * 通过编写条件方法来查找
     */
    @Test
    public void UsersRepositoryByName(){
        List<Users> list=this.usersRepository.findByName("张三");
        for (Users users:list){
            System.out.println(users);
        }
    }
    /**
     * 通过编写条件方法来查找
     */
    @Test
    public void findByNameAndAge(){
        List<Users> list=this.usersRepository.findByNameAndAge("张三",20);
        for (Users users:list){
            System.out.println(users);
        }
    }
    /**
     * 通过编写条件方法来查找
     */
    @Test
    public void findByNameLike() {
        List<Users> list = this.usersRepository.findByNameLike("张%");
        for (Users users : list) {
            System.out.println(users);
        }
    }

    /**
     * 根据id来修改
     */
    @Test
    public void updateById() {
        Users users = usersRepository.findById(1).get();
        users.setName("刚修改");
        System.out.println(usersRepository.save(users));
    }

    /**
     * 删除
     */
    @Test
    public void deleteById() {
        usersRepository.deleteById(1);
    }

}
