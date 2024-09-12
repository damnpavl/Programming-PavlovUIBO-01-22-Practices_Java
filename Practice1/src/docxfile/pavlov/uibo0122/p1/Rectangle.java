package docxfile.pavlov.uibo0122.p1;

public class Rectangle {

    double with = -1;
    double height = -1;

    Rectangle() {
    }

    Rectangle(double newWith, double newHeight) {
        with = newWith;
        height = newHeight;
    }

    double getArea() {
        return with*height;
    }
    double getPerimeter() {
        return (2*(with+height));
    }

    void setWith (double newWidh) {
        with = newWidh;
    }
    void setHeight (double newHeight) {
        height = newHeight;
    }
    void setHeightANDWith (double newWith, double newHeight) {
        with = newWith;
        height = newHeight;
    }
}


