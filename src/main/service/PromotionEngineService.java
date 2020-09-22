package main.service;

import main.Constants.Constants;
import main.model.SkuId;

import java.util.List;

/**
 * This class is the service class which will be calculating final price based on user input
 */
public class PromotionEngineService {

    SkuId skuId = new SkuId();

    public int getFinalOfferPrice(List<String> items) {

        int productA = getCount(items, Constants.PRODUCT_A);
        int productB = getCount(items, Constants.PRODUCT_B);
        int productC = getCount(items, Constants.PRODUCT_C);
        int productD = getCount(items, Constants.PRODUCT_D);

        int productAPrice = calculatePriceOfProduct(productA, skuId.getProductAQuantity(), skuId.getFirstActivePromotionalOffer(), skuId.getA());
        int productBPrice = calculatePriceOfProduct(productB, skuId.getProductBQuantity(), skuId.getSecondActivePromotionOffer(), skuId.getB());
        int combinedPriceOfCD = calculateCombinedPriceOfProductCD(productC, productD);
        return productAPrice + productBPrice + combinedPriceOfCD;
    }

    private int getCount(List<String> items, String productA) {
        return (int) items.stream().filter(item -> item.equalsIgnoreCase(productA)).count();
    }

    private int calculatePriceOfProduct(int product, int productQuantity, int promotionOfferPrice, int priceOfProduct) {
        return product / productQuantity * promotionOfferPrice + product % productQuantity * priceOfProduct;
    }

    private int calculateCombinedPriceOfProductCD(int productC, int productD) {
        if (productC == 0 || productD == 0)
            return productC * skuId.getC() + productD * skuId.getD();
        else if (productC == productD)
            return productD * skuId.getThirdActivePromotionalOffer();
        else if (productC > productD)
            return (productD * skuId.getThirdActivePromotionalOffer()) + (productC - productD) * skuId.getC();
        else
            return (productC * skuId.getThirdActivePromotionalOffer()) + (productD - productC) * skuId.getD();

    }

}
