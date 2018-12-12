public class Figure extends ElkaTry {
    private final boolean isFigureOfMen;

    public Figure(String name, Colour colour, boolean isFigureOfMen) {
        super(name, colour, Shape.FIGURE);
        this.isFigureOfMen = isFigureOfMen;
    }

    public boolean isFigureOfMen() {
        return isFigureOfMen;
    }
}
