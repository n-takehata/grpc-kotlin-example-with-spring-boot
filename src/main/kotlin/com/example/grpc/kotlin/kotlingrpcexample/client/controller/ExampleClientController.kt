package com.example.grpc.kotlin.kotlingrpcexample.client.controller

import com.example.grpc.kotlin.kotlingrpcexample.client.form.RestCreateMessageRequest
import com.example.grpc.kotlin.kotlingrpcexample.client.interceptor.MetadataClientInterceptor
import com.example.grpc.kotlingrpcexample.proto.CreateMessageRequest
import com.example.grpc.kotlingrpcexample.proto.ExampleGrpcKt
import io.grpc.ManagedChannelBuilder
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.reactive.function.server.coRouter

/**
 * gRPCで通信するクライアント(REST API)
 */
@RestController
class ExampleClientController {
    @PostMapping("/createmessage")
    suspend fun createMessage(@RequestBody request: RestCreateMessageRequest): String {
        val createMessageRequest = CreateMessageRequest.newBuilder().setName(request.name).build()
        val channel = ManagedChannelBuilder.forAddress("localhost", 6565)
            .intercept(MetadataClientInterceptor())
            .usePlaintext().build()
        val stub = ExampleGrpcKt.ExampleCoroutineStub(channel)

        val response = runBlocking {
            async { stub.createMessage(createMessageRequest) }
        }

        return response.await().message.text
    }
}
