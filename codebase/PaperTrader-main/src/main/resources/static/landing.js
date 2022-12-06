$(document).ready(function(){
    $("#investmentSearch").click(function () {
        document.cookie = $('#investment').val().toUpperCase()
        console.log(document.cookie)
    });



    const ctx = $('#dashboardGraph');

    const labels = ['1']
    const data = {
        labels: labels,
        datasets: [
            {
                label: 'Current',
                backgroundColor:['rgba(255, 99, 132, 0.2)'],
                borderColor: ['rgba(54, 162, 235, 0.2)'],
                data: 12,
                fill: true,
            }]
    };

    const config = {
        type: 'line',
        data: data,
        options: {
            responsive: true,
            plugins: {
                title: {
                    display: true,
                    text: 'Chart.js Line Chart'
                },
            },
            interaction: {
                mode: 'index',
                intersect: false
            },
            scales: {
                x: {
                    display: true,
                    title: {
                        display: true,
                        text: 'Month'
                    }
                },
                y: {
                    display: true,
                    title: {
                        display: true,
                        text: 'Value'
                    }
                }
            }
        },
    };

    const myChart = new Chart(ctx, config);

})