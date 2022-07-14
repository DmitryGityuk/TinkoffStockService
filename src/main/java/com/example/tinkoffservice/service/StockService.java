package com.example.tinkoffservice.service;

import com.example.tinkoffservice.dto.FigiesDTO;
import com.example.tinkoffservice.dto.StocksDTO;
import com.example.tinkoffservice.dto.StocksPricesDTO;
import com.example.tinkoffservice.dto.TickersDTO;
import com.example.tinkoffservice.model.Stock;

public interface StockService {
    Stock getStockByTicker(String ticker);

    StocksDTO getStockByTickers(TickersDTO tickersDTO);

    StocksPricesDTO getPrices(FigiesDTO figiesDTO);
}
