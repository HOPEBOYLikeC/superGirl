package util;

import java.util.Random;

public class RandUtil {
    /**
     * 随机验证码工具类
     */
    public static String getRandNum() {
        String randNum = new Random().nextInt(1000000) + "";
        System.out.println("生成" + randNum);
        if (randNum.length() != 6) {
            return getRandNum();
        }
        return randNum;

    }
}
