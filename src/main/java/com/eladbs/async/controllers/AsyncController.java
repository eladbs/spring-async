package com.eladbs.async.controllers;

import com.eladbs.async.services.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping(value = "/api")
public class AsyncController {
    private static final Logger logger = LoggerFactory.getLogger(AsyncController.class);

    private final AsyncService asyncService;

    public AsyncController(AsyncService asyncService) {
        this.asyncService = asyncService;
    }

    @GetMapping(value = "/async")
    public String runAsync() {
        logger.info("AsyncController - entering runAsync()");
        UUID uuid = UUID.randomUUID();
        asyncService.runAsyncJob(uuid); //TODO 4. call the async service method from the controller as usual.
        logger.info("AsyncController - exiting runAsync()");
        return uuid.toString();
    }
}
