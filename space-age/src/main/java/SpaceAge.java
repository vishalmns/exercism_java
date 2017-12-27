class SpaceAge {
    private double seconds;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }


    double onEarth() {
        double yearsOnEarth = getSeconds() / 31557600;
        return yearsOnEarth;
    }

    double onMercury() {
        double yearsComparedToEarth = 0.2408467;
        return onEarth() / yearsComparedToEarth;
    }

    double onVenus() {
        double yearsComparedToEarth = 0.61519726;
        return  onEarth() / yearsComparedToEarth;

    }

    double onMars() {
        double yearsComparedToEarth = 1.8808158;
        return onEarth() / yearsComparedToEarth;

    }

    double onJupiter() {
        double yearsComparedToEarth = 11.862615;
        return onEarth() / yearsComparedToEarth;
    }

    double onSaturn() {
        double yearsComparedToEarth = 29.447498;
        return onEarth() / yearsComparedToEarth;
    }

    double onUranus() {
        double yearsComparedToEarth = 84.016846;
        return onEarth() / yearsComparedToEarth;
    }

    double onNeptune() {
        double yearsComparedToEarth = 164.79132;
        return onEarth() / yearsComparedToEarth;
    }

}
