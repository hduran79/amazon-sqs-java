package co.com.votre.poc_sqs.business;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import co.com.votre.poc_sqs.dto.MessageDTO;
import io.awspring.cloud.sqs.operations.SqsTemplate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProducerBusiness {

    private final SqsTemplate sqsTemplate;

    @Value("${cloud.aws.end-point.uri}")
    private String endPoint;

    @Value("${cloud.aws.name-queue}")
    private String queue;

    /**
     * Method to send a message to the queue
     * @param message
     */
    public void messagedToQueue(String message) {
        sqsTemplate.send(endPoint, MessageBuilder.withPayload(message).build());
    }

    /**
     * Method to send a message to the queue
     * @param message
     */
    public void messagedToQueue(@RequestBody MessageDTO message) {
            sqsTemplate.send(endPoint, MessageBuilder.withPayload(message).build());
    }

}
