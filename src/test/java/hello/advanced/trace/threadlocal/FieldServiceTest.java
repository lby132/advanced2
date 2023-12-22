package hello.advanced.trace.threadlocal;

import hello.advanced.trace.threadlocal.code.FieldService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static java.lang.Thread.sleep;

@Slf4j
class FieldServiceTest {

    private FieldService fieldLogTrace = new FieldService();

    @Test
    void field() throws InterruptedException {
        log.info("main start");
        Runnable userA = () -> fieldLogTrace.logic("userA");
        Runnable userB = () -> fieldLogTrace.logic("userB");

        final Thread threadA = new Thread(userA);
        threadA.setName("thread-A");
        final Thread threadB = new Thread(userB);
        threadB.setName("thread-B");

        threadA.start();
        sleep(2000); // 동시성 문제 발생 안함.
        threadB.start();

        sleep(3000);
        log.info("main exit");
    }
}