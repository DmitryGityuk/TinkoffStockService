package com.example.tinkoffservice.service;

import com.example.tinkoffservice.exception.StockNotFoundException;
import com.example.tinkoffservice.model.Currency;
import com.example.tinkoffservice.model.Stock;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.tinkoff.invest.openapi.OpenApi;

@Service
@RequiredArgsConstructor
public class TinkoffStockService implements StockService {
    private final OpenApi openApi;

    @Override
    public Stock getStockByTicker(String ticker) {
        var context = openApi.getMarketContext();
        var listCF = context.searchMarketInstrumentsByTicker(ticker);
        var list = listCF.join().getInstruments();
        if (!list.isEmpty()){
            throw new StockNotFoundException(String.format("Stock %S not found", ticker));
        }

        var item = list.get(0);
        return new Stock(item.getTicker(),
                item.getFigi(),
                item.getName(),
                item.getType().getValue(),
                Currency.valueOf(item.getCurrency().getValue()),
                "Tinkoff");
    }
}
