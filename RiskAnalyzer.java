
package com.crypto;

import java.util.Random;

public class RiskAnalyzer {

    public void analyze() {

        System.out.println("Analyzing cryptocurrency market data...");

        String[] coins = {"Bitcoin", "Ethereum", "Solana", "Ripple"};
        Random random = new Random();

        for (String coin : coins) {
            double volatility = 10 + (50 - 10) * random.nextDouble();

            if (volatility > 40) {
                System.out.println(coin + " Risk Level: HIGH");
            } else if (volatility > 20) {
                System.out.println(coin + " Risk Level: MEDIUM");
            } else {
                System.out.println(coin + " Risk Level: LOW");
            }
        }

        System.out.println("Risk Analysis Completed.");
    }
}
