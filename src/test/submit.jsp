<%@page language="java" %>

<html>
<head>
        <link rel="stylesheet" type="text/css" href="style.css">
</head>
    <body>
        <h2>Welcome To Submit Page</h2>
        <h3>Hey ${principal}  ${annualInterest} ${years} The Return is ${mortgageValue}</h3>
        <form action="/submit-form" method="post">


            <label for="principal">Principal:</label>
            <input type="number" id="principal" name="principal" required><br><br>

            <label for="annualInterest">Annual Interest Rate(%):</label>
            <input type="number" id="annualInterest" name="annualInterest" step="0.01" required><br><br>

            <label for="years">Years:</label>
            <input type="number" id="years" name="years" required><br><br>

            <input type="submit" value="Calculate">
        </form>

    </body>
</html>

