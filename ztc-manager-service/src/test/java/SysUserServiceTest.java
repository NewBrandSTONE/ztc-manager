import com.ztc.manager.module.SysUser;
import com.ztc.manager.service.SysUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class SysUserServiceTest {

    @Autowired
    private SysUserService sysUserService;

    @Test
    public void findUserTest() {
        SysUser byUserName = sysUserService.findByUserName("123");
        System.out.println(byUserName);
    }

}
