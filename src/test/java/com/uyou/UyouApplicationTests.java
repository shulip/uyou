package com.uyou;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UyouApplicationTests {
    @Autowired
    private StringEncryptor stringEncryptor;

    @Test
    void contextLoads() {
        //加密方法
        System.out.println(stringEncryptor.encrypt("123456"));
        System.out.println(stringEncryptor.encrypt("123456"));
        //解密方法
        System.out.println(stringEncryptor.decrypt("B6RKhwBTDrW/dbcGNrdy9d+jk9EgzgJ8oIkwaywdx1QwE7BsmxtRFW9cNvY+XXuj"));
        System.out.println(stringEncryptor.decrypt("OAGsDE0lm2yYDtSs3CHe6EAiy+ovq+mCKqgO1kCchf629zW4kM7O45H8ABW7Wvx6"));
    }

}
