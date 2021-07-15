package com.ersen.northwindservice.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {
    private int totalPage;
    private long totalElement;
    private Object data;
}
