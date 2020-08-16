package app;

import io.vertx.core.Future;
import io.vertx.core.Promise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JMain {
    public static void main(String[] args) {
        Promise<Long> promise = Promise.promise();
        promise.complete(10L);

        Set<Future<Long>> futures = new HashSet<>(
                Arrays.asList(promise.future(), promise.future(), promise.future(), promise.future())
        );
        System.out.println(futures.size());
    }
}
