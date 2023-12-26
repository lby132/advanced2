package hello.advanced.trace.strartegy.code.template;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class TimeLogTemplateTest {

    /**
     * 템플릿 콜백 패턴
     */
    @Test
    void callbackV1() {
        final TimeLogTemplate template = new TimeLogTemplate();
        template.execute(() -> log.info("비즈니스 로직1 실행"));
        template.execute(() -> log.info("비즈니스 로직2 실행"));
    }

}