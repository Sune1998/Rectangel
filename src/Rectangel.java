public class Rectangel {
    double with = 1;
    double hieight = 1;


    Rectangel() {

    }

    Rectangel(double with, double hieight) {
        this.with = with;
        this.hieight = hieight;
    }
void getArea( double area) {
        area = with * hieight;
}

void getPerimiter(double perimiter){
       perimiter = with + with + hieight + hieight;
}
}
