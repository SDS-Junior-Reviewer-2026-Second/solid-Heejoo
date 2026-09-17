package house;

abstract class Apartment {
    private static final int UPGRADE_SQFT_INCREMENT = 40;

    int squareFootage;
    int numberOfBedrooms;

    abstract void setSquareFootage(int sqft);

    void upgrade() {
        squareFootage += UPGRADE_SQFT_INCREMENT;
        if (addsBedroomOnUpgrade()) {
            numberOfBedrooms += 1;
        }
    }

    // 기본 동작: 업그레이드하면 침실이 하나 늘어난다.
    // 예외적인 타입(Studio 등)만 이걸 오버라이드해서 false로 바꾸면 됨.
    boolean addsBedroomOnUpgrade() {
        return true;
    }
}