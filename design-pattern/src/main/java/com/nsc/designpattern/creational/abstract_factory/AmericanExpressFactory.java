package com.nsc.designpattern.creational.abstract_factory;

import com.nsc.designpattern.creational.abstract_factory.amex.AmexGoldCreditCard;
import com.nsc.designpattern.creational.abstract_factory.amex.AmexGoldValidator;
import com.nsc.designpattern.creational.abstract_factory.amex.AmexPlatinumCreditCard;
import com.nsc.designpattern.creational.abstract_factory.amex.AmexPlatinumValidator;

public class AmericanExpressFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new AmexGoldCreditCard();
            case PLATINUM:
                return new AmexPlatinumCreditCard();
            default:
                return null;
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new AmexGoldValidator();
            case PLATINUM:
                return new AmexPlatinumValidator();
            default:
                return null;
        }
    }
}
