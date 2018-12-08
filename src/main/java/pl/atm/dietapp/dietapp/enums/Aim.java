package pl.atm.dietapp.dietapp.enums;

public enum Aim {
    LOSE(-250),
    GAIN(250),
    KEEP(0);

    private int kcal;

    Aim(int kcal) {
        this.kcal = kcal;
    }

    public int getKcal() {
        return kcal;
    }
}
