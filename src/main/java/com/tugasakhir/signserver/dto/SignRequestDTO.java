package com.tugasakhir.signserver.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class SignRequestDTO {
    private String email;
    private String passphrase;
    private MultipartFile document;

    private Integer originX;
    private Integer originY;
    private Integer width;
    private Integer height;
}
