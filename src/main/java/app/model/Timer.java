package app.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Timer {

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }

    @Override
    public String toString() {
        return "Timer{" +
                "nanoTime=" + nanoTime +
                '}';
    }
}
