package org.logical.emp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class MonthlySalesCalculator {
    public static void main(String[] args) {
        // Example sales data
        String[][] salesData = {
                {"1", "101", "2025-03-05", "500"},
                {"2", "102", "2025-03-10", "300"},
                {"3", "101", "2025-03-15", "200"},
                {"4", "103", "2025-02-25", "400"},
                {"5", "102", "2025-03-20", "150"}
        };

        // Get the current month and year
        LocalDate now = LocalDate.now();
        int currentYear = now.getYear();
        int currentMonth = now.getMonthValue();

        // Map to store sales per salesperson
        Map<String, Double> salesPerPerson = new HashMap<>();
        for (String[] sale : salesData) {
            String salesPersonId = sale[1];
            String transactionDate = sale[2];
            double amountOrCost = Double.parseDouble(sale[3]);

            // Parse the transaction date
            LocalDate date = LocalDate.parse(transactionDate, DateTimeFormatter.ISO_DATE);
            // Check if the transaction belongs to the current month
            if (date.getYear() == currentYear && date.getMonthValue() == currentMonth) {
                salesPerPerson.put(salesPersonId, salesPerPerson.getOrDefault(salesPersonId, 0.0) + amountOrCost);
            }
        }
        // Display the total sales for each salesperson
        System.out.println("Sales for the current month:");
        for (Map.Entry<String, Double> entry : salesPerPerson.entrySet()) {
            System.out.println("Salesperson ID: " + entry.getKey() + ", Total Sales: " + entry.getValue());
        }
    }
}