package main;

import main.controller.PromotionEngineController;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PromotionEngineApplication {


    public static void main(String[] args) {

        PromotionEngineController promotionEngineController = new PromotionEngineController();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Products :");
        String productToPurchase = null;
        try {
            productToPurchase = br.readLine();
            System.out.println("You entered " + productToPurchase);
            List<String> productList = new ArrayList<String>(Arrays.asList(productToPurchase.split("")));
            System.out.println("productList " + productList.toString());
            promotionEngineController.getOfferPrice(productList);
        } catch (IOException e) {
            System.out.println("Exception in reading  " + e.getMessage());
        }


    }


}