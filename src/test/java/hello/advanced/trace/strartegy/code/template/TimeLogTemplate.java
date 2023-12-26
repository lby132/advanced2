package hello.advanced.trace.strartegy.code.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeLogTemplate {

    public void execute(Callback callback) {
        long startTime = System.currentTimeMillis();
        //비즈니스 로직 실행
        callback.call();
        //비즈니스 로직 종료
        final long endTime = System.currentTimeMillis();
        final long resultTime = System.currentTimeMillis();
        log.info("resultTime={}", resultTime);
    }
}
