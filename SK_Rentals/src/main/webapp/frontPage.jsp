<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>SK Rental - Billing Page</title>
    <style>
        body {
    margin: 0;
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    font-size: 18px;
    background: linear-gradient(to right, #f2fcfe, #e0f7fa);
    color: #333;
}

.container {
    display: flex;
    height: 100vh;
}

.billing-section, .schedule-section {
    flex: 1;
    padding: 25px;
    box-sizing: border-box;
    box-shadow: inset 0 0 10px rgba(0, 0, 0, 0.05);
}

.billing-section {
    background: linear-gradient(to top right, #e3f2fd, #ffffff);
    border-right: 2px solid #ccc;
}

.schedule-section {
    background: #ffffff;
}

h2 {
    text-align: center;
    margin-bottom: 30px;
    font-size: 26px;
    color: #2c3e50;
}

.form-group {
    display: flex;
    align-items: center;
    margin-bottom: 20px;
}

label {
    width: 140px;
    font-weight: 600;
    margin-right: 12px;
    font-size: 18px;
    color: #444;
}

input[type="text"] {
    width: 150px;
    padding: 10px 12px;
    font-size: 18px;
    border: 1px solid #bbb;
    border-radius: 6px;
    transition: all 0.2s ease;
}

input[type="text"]:focus {
    border-color: #26a69a;
    outline: none;
    box-shadow: 0 0 5px rgba(38, 166, 154, 0.4);
}

.add-btn {
    background-color: #26a69a;
    color: white;
    padding: 10px 22px;
    border: none;
    cursor: pointer;
    font-size: 18px;
    border-radius: 6px;
    transition: background-color 0.3s ease, transform 0.2s;
}

.add-btn:hover {
    background-color: #2bbbad;
    transform: translateY(-2px);
}

table {
    width: 100%;
    border-collapse: collapse;
    margin-top: 15px;
    border-radius: 8px;
    overflow: hidden;
    box-shadow: 0 0 10px rgba(0,0,0,0.1);
}

th, td {
    border: 1px solid #ccc;
    padding: 12px;
    text-align: center;
    font-size: 17px;
}

th {
    background-color: #81d4fa;
    color: #1a237e;
}

td {
    background-color: #f9f9f9;
}
    </style>
</head>
<body>
    <div class="container">
        <!-- Billing Section -->
        <div class="billing-section">
            <h2>Billing</h2>

            <!-- Add Item Form -->
            <form action="AddItemServlet" method="post">
                <div class="form-group">
                    <label for="billNumber">Bill Number:</label>
                    <input type="text" id="billNumber" name="billNumber" required>
                </div>

                <div class="form-group">
                    <label for="lehangaInput">Lehanga Code:</label>
                    <input type="text" id="lehangaInput" name="lehangaCode">
                </div>

                <div class="form-group">
                    <label for="blouseInput">Blouse Code:</label>
                    <input type="text" id="blouseInput" name="blouseCode">
                </div>

                <div class="form-group">
                    <label for="odhaniInput">Odhani Code:</label>
                    <input type="text" id="odhaniInput" name="odhaniCode">
                </div>

                <div class="form-group">
                    <label></label>
                    <button type="submit" class="add-btn">Add</button>
                </div>
            </form>

            <!-- Final Submit Form -->
            <form action="FinalizeBillServlet" method="post">
                <div class="form-group">
                    <label></label>
                    <button type="submit" class="add-btn">Final Submit</button>
                </div>
            </form>
        </div>

        <!-- Schedule Section -->
        <div class="schedule-section">
            <h2>Rental Schedule</h2>
            <table>
                <tr>
                    <th>Dress Code</th>
                    <th>Today</th>
                    <th>Tomorrow</th>
                    <th>Day After Tomorrow</th>
                    <th>+3 Days</th>
                    <th>+4 Days</th>
                    <th>+5 Days</th>
                </tr>
                <tr>
                    <td>LH001</td>
                    <td></td><td>-</td><td></td><td></td><td></td><td></td>
                </tr>
                <tr>
                    <td>BL002</td>
                    <td>-</td><td>sj</td><td>-</td><td></td><td></td><td></td>
                </tr>
                <tr>
                    <td>OD003</td>
                    <td>s</td><td>d</td><td>-</td><td></td><td></td><td></td>
                </tr>
                <!-- Add more dress rows as needed -->
            </table>
        </div>
    </div>
</body>
</html>
