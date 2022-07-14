package com.example.tinkoffservice.controller;

import com.example.tinkoffservice.dto.FigiesDTO;
import com.example.tinkoffservice.dto.StocksDTO;
import com.example.tinkoffservice.dto.StocksPricesDTO;
import com.example.tinkoffservice.dto.TickersDTO;
import com.example.tinkoffservice.model.Stock;
import com.example.tinkoffservice.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class StockController {
    private final StockService stockService;

    @GetMapping("/stocks/{ticker}")
    public Stock getStock(@PathVariable String ticker) {
        return stockService.getStockByTicker(ticker);
    }

    @PostMapping("/stocks/getStocksByTickers")
    public StocksDTO getStocksByTickers(@RequestBody TickersDTO tickersDTO) {
        return stockService.getStockByTickers(tickersDTO);
    }

    @PostMapping("/prices")
    public StocksPricesDTO getPrices(@RequestBody FigiesDTO figiesDTO) {
        return stockService.getPrices(figiesDTO);
    }
}
