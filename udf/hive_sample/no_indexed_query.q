SELECT year(ymd), avg(price_close) FROM stocks  where symbol='AAPL' group by year(ymd);
