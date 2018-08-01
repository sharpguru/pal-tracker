package io.pivotal.pal.tracker;


import org.springframework.boot.actuate.health.Health;

public interface HealthIndicator {

    public Health health();
}
