SET hive.index.compact.file=/tmp/index_test_result ;
SET hive.input.format=org.apache.hadoop.hive.ql.index.compact.HiveCompactIndexInputFormat;
SELECT year(ymd), avg(price_close) FROM stocks  where symbol='AAPL' group by year(ymd);
