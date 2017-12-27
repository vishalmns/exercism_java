class Triangle {
    private double side1;
    private double side2;
    private double side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        boolean triangleCanBeFormed = side1 + side2 >= side3 && side2 +side3 >= side1 && side3 + side1 >= side2 ? true:false;
        if(side1 == 0 || side2 == 0 || side3 == 0) {
            throw new TriangleException("one of the side is zero");
        }
        if (!triangleCanBeFormed) {
            throw new TriangleException("sum of two side is less than third side");
        }
    }

    boolean isEquilateral() {
        if (side1 == side2 && side2 == side3){
            return true;
        }
        return false;
    }

    boolean isIsosceles() {
        if(side1 == side2 || side2 == side3 || side3 == side1) {
            return true;
        }
        return false;
    }

    boolean isScalene() {
        if (side1 != side2 && side2 != side3 && side3 != side1) {
            return true;
        }
        return false;
    }

}
