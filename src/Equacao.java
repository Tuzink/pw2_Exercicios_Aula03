//Cálculo
public class Equacao {
    int a;
    int b;
    int c;
    int delta;

    void CalcDelta() {
        delta = (b * b) - 4 * a * c;
    }

    String raiz() {
        if (delta < 0) {
        return "Não existe raiz real";
        }
        else if (delta == 0 ){
        return "Existe raiz real";
    }
        else {
            return "Existe mais duas raizes";
        }
    }
}