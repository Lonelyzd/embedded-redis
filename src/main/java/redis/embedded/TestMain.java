package redis.embedded;

import java.io.IOException;

/**
 * @author : z_dd
 * @date : 2024/9/4 上午9:47
 **/
public class TestMain {
    public static void main(String[] args) throws IOException {
        System.out.println("Redis正在启动");

        RedisServer build = RedisServer.builder()
                .redisExecProvider(RedisExecProvider.defaultProvider())
                .port(6379)
                .setting("bind 0.0.0.0")
                .setting("protected-mode no").build();
        build.start();
    }
}
