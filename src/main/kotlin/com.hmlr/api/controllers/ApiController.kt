package com.hmlr.api.controllers

import com.hmlr.api.models.*
import com.hmlr.api.rpcClient.NodeRPCConnection
import net.corda.core.identity.CordaX500Name
import net.corda.core.node.services.IdentityService
import net.corda.core.node.services.Vault
import net.corda.core.node.services.vault.PageSpecification
import net.corda.core.node.services.vault.QueryCriteria
import net.corda.core.node.services.vault.Sort
import net.corda.core.node.services.vault.builder
import net.corda.core.utilities.loggerFor
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import net.corda.core.utilities.getOrThrow
import java.io.PrintWriter
import java.io.StringWriter
import java.math.BigDecimal
import java.time.Instant
import java.time.LocalDate


@RestController
@RequestMapping("/api")
class ApiController(private val rpc: NodeRPCConnection) {

//    private val rpcOps = rpc.proxy
//    val myIdentity = rpcOps.nodeInfo().legalIdentities.first()

    companion object {
        private val logger = loggerFor<ApiController>()
    }

    /**
     * Return 'Hello World!'
     */
    @GetMapping(value = "/hello", produces = arrayOf(MediaType.TEXT_PLAIN_VALUE))
    fun hello() = ResponseEntity.ok("Hello World!")

    /**
     * Return the node's name
     */
//    @GetMapping(value = "/me", produces = arrayOf(MediaType.APPLICATION_JSON_VALUE))
//    fun me() = mapOf("me" to myIdentity.name)

    /**
     * Returns all parties registered with the [NetworkMapService]. These names can be used to look up identities
     * using the [IdentityService].
     */
//    @GetMapping(value = "/peers", produces = arrayOf(MediaType.APPLICATION_JSON_VALUE))
//    fun peers() = mapOf("peers" to rpcOps.networkMapSnapshot()
//            .filter { nodeInfo -> nodeInfo.legalIdentities.first() != myIdentity }
//            .map { it.legalIdentities.first().name.organisation })

}