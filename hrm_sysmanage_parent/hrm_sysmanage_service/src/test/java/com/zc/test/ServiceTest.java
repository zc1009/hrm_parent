package com.zc.test;

import com.zc.HrmSysmanageService9001Application;
import com.zc.domain.Systemdictionary;
import com.zc.service.ISystemdictionaryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HrmSysmanageService9001Application.class)
public class ServiceTest {
    @Autowired
    private ISystemdictionaryService systemdictionaryService;
    @Test
    public void test() throws Exception{
        for (Systemdictionary systemdictionary : systemdictionaryService.selectList(null)) {
            System.out.println(systemdictionary);

        }
    }
}
