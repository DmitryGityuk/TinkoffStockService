package com.example.tinkoffservice.dto;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.List;

@Value
@AllArgsConstructor
public record StocksPricesDTO(List<StockPrice> prices) {
}
