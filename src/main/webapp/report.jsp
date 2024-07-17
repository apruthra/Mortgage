<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Mortgage Report</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style1.css">
</head>
<body>
    <h1>Mortgage Balance Report</h1>
    <table>
        <thead>
            <tr>
                <th>Month</th>
                <th>Remaining Balance</th>
            </tr>
        </thead>
        <tbody>
            <%
                double[] balanceCollection = (double[]) request.getAttribute("balanceCollection");
                if (balanceCollection != null) {
                    for (int i = 0; i < balanceCollection.length; i++) {
                        double balance = balanceCollection[i];
            %>
            <tr>
                <td><%= (i + 1) %></td>
                <td><%= balance %></td>
            </tr>
            <%
                    }
                } else {
            %>
            <tr>
                <td colspan="2">No data available</td>
            </tr>
            <%
                }
            %>
        </tbody>
    </table>
</body>
</html>
