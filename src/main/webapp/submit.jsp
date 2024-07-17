<!DOCTYPE html>
<html>
<head>
    <title>Mortgage Calculation Result</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style2.css">
</head>
<body>
    <h1>Mortgage Calculation Result</h1>
    <p>Principal Amount: ${principal}</p>
    <p>Annual Interest Rate: ${annualInterest}%</p>
    <p>Number of Years: ${years}</p>
    <p>Calculated Mortgage Value: ${mortgageValue}</p>
    <br>
    <a href="${pageContext.request.contextPath}/home">Go Back</a>
    <br>
    <a href="${pageContext.request.contextPath}/report">View Mortgage Report</a>
</body>
</html>
