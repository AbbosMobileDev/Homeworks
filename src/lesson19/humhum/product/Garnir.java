package lesson19.humhum.product;

import lesson19.humhum.product_type.GarnirType;

public class Garnir extends BaseProduct {
    public Garnir(GarnirType garnirType, int price, int count) {
        super(garnirType, price, count);
    }

    public Garnir(GarnirType garnirType, int count) {
        super(garnirType, count);
    }
}
