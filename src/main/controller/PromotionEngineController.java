package main.controller;

import main.service.PromotionEngineService;

import java.util.List;

/**
 * This is the controller class which accepts user input and process to find the final offer price
 */
public class PromotionEngineController {

    PromotionEngineService promotionEngineService = new PromotionEngineService();

    /**
     * this is the method will return applied final offer price
     * @param items list of products user wants to purchase
     */
    public void getOfferPrice(List<String> items) {
        int finalPrice = items.size() > 0 ? promotionEngineService.getFinalOfferPrice(items) : 0;
        System.out.println("finalPrice :" + finalPrice);

    }


}
