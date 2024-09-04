package redis.embedded;

import java.io.IOException;

/**
 * @author : z_dd
 * @date : 2024/9/4 上午9:47
 **/
public class TestMain {
    public static void main(String[] args) throws IOException {
        System.out.println("Redis正在启动");
        RedisServer redisServer = new RedisServer(6379);
        redisServer.start();
    }
}
