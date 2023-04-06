package org.sergiogarguir.optional.ejemplo.enums;

public enum CardProduct {
    CARD_PRODUCT_VISA("VISAEXCLU", "37"),
    CARD_PRODUCT_MASTER("YOYMASTREN", "61"),
    CARD_PRODUCT_VISA_DEBIT("YOYBANEALT", "74"),
    UNDEFINED("", "0");


    private final String description;
    private final String code;

    private CardProduct(String description, String code)
    {
        this.description = description;
        this.code = code;
    }

    public String getDescription() {
        return this.description;
    }
    public String getCode() {
        return this.code;
    }

    public CardProduct getCardCode(String cardName){
        for(CardProduct cardProduct: values()){
            if(cardProduct.getDescription().equals(cardName)){
                return cardProduct;
            }
        }
        return UNDEFINED;
    }
}
