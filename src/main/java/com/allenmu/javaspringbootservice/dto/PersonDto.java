package com.allenmu.javaspringbootservice.dto;

import com.allenmu.javaspringbootservice.util.Position;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {
    @NonNull
    private String name;
//    private Position position;
}
