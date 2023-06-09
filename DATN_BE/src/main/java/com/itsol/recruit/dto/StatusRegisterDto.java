package com.itsol.recruit.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StatusRegisterDto {
    Long jobRegisterId;

    Long statusRegisterId;
}
