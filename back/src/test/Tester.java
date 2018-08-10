/**
 * @author zjq41981
 * @date 2018/8/9
 */
import com.heeexy.example.MyApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * 单元测试继承该类即可
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyApplication.class)
//@Transactional
//@Rollback
public abstract class Tester {}
