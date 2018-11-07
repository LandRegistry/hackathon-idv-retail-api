package com.hmlr.api

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


/**
 * Our Spring Boot application.
 */
@SpringBootApplication
open class Server

/**
 * Starts our Spring Boot application.
 */
fun main(args: Array<String>) {
    //Check required env vars exist
    require(System.getenv("CONFIG_RPC_HOST") != null) { "CONFIG_RPC_HOST env var was not set." }
    require(System.getenv("CONFIG_RPC_PORT") != null) { "CONFIG_RPC_PORT env var was not set." }
    require(System.getenv("CONFIG_RPC_USERNAME") != null) { "CONFIG_RPC_USERNAME env var was not set." }
    require(System.getenv("CONFIG_RPC_PASSWORD") != null) { "CONFIG_RPC_PASSWORD env var was not set." }

    //Run main api
    SpringApplication.run(Server::class.java, *args)
}