package com.example.AgendaCandy.Dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EventDto {
    private Long id;
    private LocalDate eventDate;
    private String clientName;
    private String location;
    private String phone;
    private List<ItemDto> items;
}
