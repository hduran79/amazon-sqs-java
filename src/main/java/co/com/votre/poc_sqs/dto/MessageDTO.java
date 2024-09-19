package co.com.votre.poc_sqs.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MessageDTO implements Serializable {

    private String zone;
    private String name;
    private String dni;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonProperty("send_at")
    private LocalDate sendAt;

}
