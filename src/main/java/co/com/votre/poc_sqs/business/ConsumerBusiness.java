package co.com.votre.poc_sqs.business;

import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Service;

import co.com.votre.poc_sqs.dto.MessageDTO;
import io.awspring.cloud.sqs.annotation.SqsListener;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import software.amazon.awssdk.services.sqs.model.Message;

@Slf4j
@Service
@AllArgsConstructor
public class ConsumerBusiness {

    /**
     * Method to load messages from the queue
     * @param message
     * @param headers
     * @param messageakc
     * @throws Exception
     */
    @SqsListener("sqs-lab-queue.fifo")
    public void loadMessagesFromQueue(MessageDTO message, MessageHeaders headers, Message messageakc) throws Exception {
        System.out.println("*********** Queue Messages: ************ " + message + headers.getId() + messageakc.messageId());
        //throw new Exception("something went wrong");
    }
}
