package hello.advanced.trace.strartegy.code.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 전략을 파라미터로 전달 받는 방식
 */
@Slf4j
public class ContextV2 {

    public void execute(Strategy strategy) {
        long startTime = System.currentTimeMillis();
        //비즈니스 로직 실행
        strategy.call();
        //비즈니스 로직 종료
        final long endTime = System.currentTimeMillis();
        final long resultTime = System.currentTimeMillis();
        log.info("resultTime={}", resultTime);
    }
}
