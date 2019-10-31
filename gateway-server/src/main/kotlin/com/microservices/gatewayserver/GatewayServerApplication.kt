package com.microservices.gatewayserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@SpringBootApplication
@EnableZuulProxy
private class GatewayServerApplication

fun main(args: Array<String>) {
	runApplication<GatewayServerApplication>(*args)
}
