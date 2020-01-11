package thesallab.foundation.helper;

import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Zhang, Yin
 */
public class MongoHelper {

    // **************** 公开变量

    // **************** 私有变量

    // **************** 继承方法

    // **************** 公开方法

    public static MongoClient clientFromMongodbServers(String mongodbServers) {
        return new MongoClient((List<ServerAddress>) Arrays.stream(
                mongodbServers.split(";")).map(server -> server.split(":"))
                .collect(
                        ArrayList<ServerAddress>::new,
                        (list, pair) -> list.add(new ServerAddress(pair[0],
                                Integer.parseInt(pair[1]))),
                        ArrayList::addAll));
    }

    // **************** 私有方法

}
