package chenjiajin.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    //定义用户信息服务（查询用户信息） 基于内存的 不是查数据库的
    //可用来模拟数据
//    @Bean
//    public UserDetailsService userDetailsService() {
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        manager.createUser(User.withUsername("zhangsan").password("123").authorities("p1","p3","p4").build());
//        manager.createUser(User.withUsername("lisi").password("123").authorities("p2").build());
//        return manager;
//    }

    //密码编码器
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    //安全拦截机制
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/r/r1").hasAnyAuthority("p1")//要求访问这个路径要有p1权限
                .antMatchers("/r/r2").hasAnyAuthority("p2")//要求访问这个路径要有p2权限
                .antMatchers("/r/**").authenticated()//所有/r/** 下的所有请求必须认证通过
                .anyRequest().permitAll()//除了/r/**，其他的请求可以访问
                .and()
                .formLogin()//允许表单登录
                .loginPage("/login.html")//自定义登录页面
                .loginProcessingUrl("/login")//登录的路径，自定义登录页面一定要有
                .successForwardUrl("/login-success")//自定义登录成功的页面资料
                .and()
                .csrf().disable();//关闭csrf验证

    }


}
