$(document).ready(function(){
    /**
     * This javascript is utilized for client side scripting to consume the Stock API and display relevant stock
     * information to be consumed by the reactive graph library
     * */
    let stockPrice
    const priceData =[]
    $("#investmentSearch").click(function () {
        document.cookie = $('#investment').val().toUpperCase()
        console.log(document.cookie)
    });
    const settings = {
        "async": true,
        "crossDomain": true,
        "url": "https://alpha-vantage.p.rapidapi.com/query?interval=5min&function=TIME_SERIES_INTRADAY&symbol=MSFT&datatype=json&output_size=compact",
        "method": "GET",
        "headers": {
            "X-RapidAPI-Key": "fddf87e19bmsh292c08c8c5c710ep1fc62ejsnf1cba095add1",
            "X-RapidAPI-Host": "alpha-vantage.p.rapidapi.com"
        }
    };

    $.ajax(settings).done(function (response) {
        console.log(response);
        Object.entries(response["Time Series (5min)"]).forEach(entry => {
            const[key, value] = entry;
            console.log(key,value)
            let ohlcData = Object.values(value)
            priceData.push({
                x: key,
                y:[ohlcData[0], ohlcData[1], ohlcData[2], ohlcData[3]]
            })
        })
        const options = {
            series: [{
                data: priceData
            }],
            chart: {
                type: 'candlestick',
                height: 350
            },
            title: {
                text: document.cookie,
                align: 'left'
            },
            xaxis: {
                type: 'datetime'
            },
            yaxis: {
                tooltip: {
                    enabled: true
                }
            }
        };
        const chart = new ApexCharts(document.querySelector("#dashboardGraph"), options);
        chart.render();
    });

    $("#tradeModalButton").click(function (){
        $("#dashboardGraph").empty()
        const realStonks = {
            "async": true,
            "crossDomain": true,
            "url": "https://realstonks.p.rapidapi.com/TSLA",
            "method": "GET",
            "headers": {
                "X-RapidAPI-Key": "fddf87e19bmsh292c08c8c5c710ep1fc62ejsnf1cba095add1",
                "X-RapidAPI-Host": "realstonks.p.rapidapi.com"
            }
        };
        $.ajax(realStonks).done(function (response) {
            console.log(response);
            stockPrice = response['price']
        });
        $("#currentMarketPrice").text(stockPrice)
    })

    $("#buyStock").click(function (){
        const buyQuantity = $("#quantityValue").val()
        const realStonks = {
            "async": true,
            "crossDomain": true,
            "url": "https://realstonks.p.rapidapi.com/TSLA",
            "method": "GET",
            "headers": {
                "X-RapidAPI-Key": "fddf87e19bmsh292c08c8c5c710ep1fc62ejsnf1cba095add1",
                "X-RapidAPI-Host": "realstonks.p.rapidapi.com"
            }
        };

        $.ajax(realStonks).done(function (response) {
            console.log(response);
            stockPrice = response['price']
            $.ajax({
                type:"POST",
                url: "/buyStock",
                data: {stock:  stockPrice, quantity: buyQuantity},
                success: function (response) {
                    console.log(response)
                },
                error: function(error){
                    console.log(error)
                }
            });
        });
    })

    $("#oneYearPriceButton").click(function (){
        $("#dashboardGraph").empty()
        const settings = {
            "async": true,
            "crossDomain": true,
            "url": "https://alpha-vantage.p.rapidapi.com/query?symbol=MSFT&function=TIME_SERIES_MONTHLY&datatype=json",
            "method": "GET",
            "headers": {
                "X-RapidAPI-Key": "fddf87e19bmsh292c08c8c5c710ep1fc62ejsnf1cba095add1",
                "X-RapidAPI-Host": "alpha-vantage.p.rapidapi.com"
            }
        };

        $.ajax(settings).done(function (response) {
            console.log(response);
            Object.entries(response["Monthly Time Series"]).forEach(entry => {
                const[key, value] = entry;
                console.log(key,value)
                let ohlcData = Object.values(value)
                priceData.push({
                    x: key,
                    y:[ohlcData[0], ohlcData[1], ohlcData[2], ohlcData[3]]
                })
            })
            const options = {
                series: [{
                    data: priceData
                }],
                chart: {
                    type: 'candlestick',
                    height: 350
                },
                title: {
                    text: document.cookie,
                    align: 'left'
                },
                xaxis: {
                    type: 'datetime'
                },
                yaxis: {
                    tooltip: {
                        enabled: true
                    }
                }
            };
            const chart = new ApexCharts(document.querySelector("#dashboardGraph"), options);
            chart.render();
            console.log(options["series"])
        });

    });

    $("#livePriceButton").click(function (){
        $("#dashboardGraph").empty()
        const settings = {
            "async": true,
            "crossDomain": true,
            "url": "https://alpha-vantage.p.rapidapi.com/query?interval=5min&function=TIME_SERIES_INTRADAY&symbol=MSFT&datatype=json&output_size=compact",
            "method": "GET",
            "headers": {
                "X-RapidAPI-Key": "fddf87e19bmsh292c08c8c5c710ep1fc62ejsnf1cba095add1",
                "X-RapidAPI-Host": "alpha-vantage.p.rapidapi.com"
            }
        };

        $.ajax(settings).done(function (response) {
            console.log(response);
            Object.entries(response["Time Series (5min)"]).forEach(entry => {
                const[key, value] = entry;
                console.log(key,value)
                let ohlcData = Object.values(value)
                priceData.push({
                    x: key,
                    y:[ohlcData[0], ohlcData[1], ohlcData[2], ohlcData[3]]
                })
            })
            const options = {
                series: [{
                    data: priceData
                }],
                chart: {
                    type: 'candlestick',
                    height: 350
                },
                title: {
                    text: document.cookie,
                    align: 'left'
                },
                xaxis: {
                    type: 'datetime'
                },
                yaxis: {
                    tooltip: {
                        enabled: true
                    }
                }
            };
            const chart = new ApexCharts(document.querySelector("#dashboardGraph"), options);
            chart.render();
            console.log(options["series"])
        });
    });
})