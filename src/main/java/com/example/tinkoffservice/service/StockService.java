package com.example.tinkoffservice.service;

import com.example.tinkoffservice.model.Stock;

public interface StockService {
    Stock getStockByTicker(String ticker);
}
