package com.example.tinkoffservice.dto;

import lombok.AllArgsConstructor;
import lombok.Value;

@AllArgsConstructor
@Value
public record StockPrice(String figi, Double price) {
}
