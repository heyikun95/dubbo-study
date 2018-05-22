import com.alibaba.dubbo.config.ApplicationConfig;
import com.example.demo.ServiceCommonProviderApplication;
import com.example.demo.service.IDemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * PACKAGE      :   PACKAGE_NAME
 * Author       :   yikun.he
 * Create Time  :   2018/5/17 14:03
 * 文件描述     :
 **/
@SpringBootTest(classes = ServiceCommonProviderApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class DemoTest {

    @Autowired
    private IDemoService demoService;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Test
    public void testDemo(){
        Integer result = this.demoService.test();
        System.out.println(result);
    }

    @Test
    public void testRedis(){
        String name = this.redisTemplate.opsForValue().get("name");
        System.out.println(name);
    }
}
