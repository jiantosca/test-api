package com.jonnyi.api.config;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Slf4j
@Configuration
public class RouteConfig {

    @Value("${spring.application.name}")
    String appName;

    @Bean
    public RouterFunction<ServerResponse> testRoute() {
        log.debug("creating /test router function.");
        return RouterFunctions.route(
                GET("/test").and(accept(MediaType.APPLICATION_JSON)), serverReq -> ServerResponse.ok()
                        .contentType(MediaType.TEXT_PLAIN)
                        .body(Mono.just(String.format("Ok (from %s)", appName)), String.class));
    }
}
