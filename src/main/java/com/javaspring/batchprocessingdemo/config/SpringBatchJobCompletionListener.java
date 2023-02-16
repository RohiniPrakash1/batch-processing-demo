package com.javaspring.batchprocessingdemo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class SpringBatchJobCompletionListener extends JobExecutionListenerSupport {
    Logger logger = LoggerFactory.getLogger(SpringBatchJobCompletionListener.class);

    @Override
    public void beforeJob(JobExecution jobExecution) {
        logger.info("SpringBatchJobCompletionListener - BEFORE BATCH JOB STARTS");
    }


    @Override
    public void afterJob(JobExecution jobExecution) {
        if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
            logger.info("SpringBatchJobCompletionListener - BATCH JOB COMPLETED SUCCESSFULLY");
        } else if (jobExecution.getStatus() == BatchStatus.FAILED) {
            logger.info("SpringBatchJobCompletionListener - BATCH JOB FAILED");
        }
    }

}
