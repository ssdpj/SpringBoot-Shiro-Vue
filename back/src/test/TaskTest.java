import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.BKUser;
import com.heeexy.example.request.TaskAddRequest;
import com.heeexy.example.response.BaseResponse;
import com.heeexy.example.service.TaskService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zjq41981
 * @date 2018/8/9
 */
public class TaskTest extends Tester {

    @Autowired
    private TaskService taskService;

    @Test
    public void commit() {
        TaskAddRequest request=new TaskAddRequest();
        BKUser bkUser =new BKUser();
        bkUser.setUserId(3);
        request.setUser(bkUser);
        request.setTaskName("任务一");
        request.setType(2);
        BaseResponse response = taskService.taskCommit(request);
        System.out.println(JSONObject.toJSONString(response));
    }
}
