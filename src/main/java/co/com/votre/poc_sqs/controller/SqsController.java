package co.com.votre.poc_sqs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.votre.poc_sqs.business.ProducerBusiness;
import co.com.votre.poc_sqs.dto.MessageDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping(value = "sqs")
public class SqsController {

    private final ProducerBusiness awsBusiness;

    @GetMapping("/publish/{msg}")
    public void putMessagedToQueue(@PathVariable("msg") String message) {
        awsBusiness.messagedToQueue(message);
    }
        
    @PostMapping("/publish")
    public void postMessagedToQueue(@RequestBody MessageDTO message) {
        awsBusiness.messagedToQueue(message);
    }
    
}
