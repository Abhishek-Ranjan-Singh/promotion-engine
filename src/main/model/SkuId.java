package main.model;

import main.Constants.Constants;

public class SkuId {

    private final int A = Constants.PRICE_A;
    private final int B = Constants.PRICE_B;
    private final int C = Constants.PRICE_C;
    private final int D = Constants.PRICE_D;


    public int getA() {
        return A;
    }

    public int getB() {
        return B;
    }

    public int getC() {
        return C;
    }

    public int getD() {
        return D;
    }

    public int getFirstActivePromotionalOffer() {
        return Constants.ACTIVE_PROMOTION_OFFER_ONE;
    }

    public int getSecondActivePromotionOffer() {
        return Constants.ACTIVE_PROMOTION_OFFER_TWO;
    }

    public int getThirdActivePromotionalOffer() {
        return Constants.ACTIVE_PROMOTION_OFFER_THREE;
    }

    public int getProductAQuantity() {
        return Constants.FIRST_OFFER_A_QUANTITY;
    }

    public int getProductBQuantity() {
        return Constants.FIRST_OFFER_B_QUANTITY;
    }
}
