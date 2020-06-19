package chenjiajin.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        //Spring security 自带的密码加密
//        String hashpw = BCrypt.hashpw("123",BCrypt.gensalt());
//        System.out.println(hashpw);
        //TODO 操作数据库拿到了用户数据了
        //TODO 外层会自己对用户输入的密码进行加密  然后和数据库查出来的密码进行比较 
        UserDetails userDetails = User.withUsername("zhangsan").password("$2a$10$VNQjFq82Bbl6gNDbQUFzk.UGpLxHvSNjCJp/DHlo7kqhoiGUsSVEC").authorities("p1").build();


        return userDetails;
    }
}
