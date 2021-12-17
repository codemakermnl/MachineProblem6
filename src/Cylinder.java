public class Cylinder extends Circle implements Shape3D{

    public Cylinder(double radius, double height) {
        super(radius, height);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getVolume() {
        return getArea() * getHeight();
    }

    @Override
    public double getSurface() {
        return (2 * Math.PI * getRadius() * getHeight()) + 2 * Math.PI * getRadius() * getRadius();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cylinder cylinder = (Cylinder) o;
        return Double.compare(cylinder.getArea(), this.getArea()) == 0 &&
                Double.compare(cylinder.getSurface(), this.getSurface()) == 0 &&
                Double.compare(cylinder.getVolume(), this.getVolume()) == 0;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Area: " + Formatter.format(getArea()) + ", Volume: " + Formatter.format(getVolume()) + ", Surface: " + Formatter.format(getSurface());
    }
}
