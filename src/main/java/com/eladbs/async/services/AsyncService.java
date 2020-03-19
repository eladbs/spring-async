package com.eladbs.async.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@Service
public class AsyncService {
    private static final Logger logger = LoggerFactory.getLogger(AsyncService.class);

    /*
        Example of how to setup an async service method.
        When running look at the threads names.

        Important - Methods annotated with @Async should have a void as return type.

        Giving @Async() a name of executor specifies a specific Executor to run the tasks.
        Please look at com.eladbs.async.configurations.ThreadPoolConfig for the configuration of the Thread Pool.
     */
//    @Async
    @Async(value = "asyncTaskExecutor") // This is optional. Uncomment the above line and comment this to run on the default thread pool.
    public void runAsyncJob(UUID uuid) { //TODO 2. add async annotation to service method. return type must be void.
        logger.info("Received request to process in AsyncService.runAsyncJob()");
        try {
            Thread.sleep(5 * 1000);
            logger.info("Processing complete. Saving {} to DB.", uuid.toString());
        }
        catch (InterruptedException ie) {
            logger.error("Error in AsyncService.runAsyncJob(): {}", ie.getMessage());
        }
    }
}
