## 1. eureka开启验证后无法连接注册中心
查资料了解到新版（Spring Cloud 2.0 以上）的security默认启用了csrf检验，要在eurekaServer端配置security的csrf检验为false
**解决步骤**
1. 在 Eureka Server 项目中，增加存放配置的专用包目录；
2. 添加一个继承 WebSecurityConfigurerAdapter 的类；
3. 在类上添加 @EnableWebSecurity 注解；
4. 覆盖父类的 configure(HttpSecurity http) 方法，关闭掉 csrf，至此大工告成。
**示例代码**
```java
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        super.configure(http);
    }
}
```