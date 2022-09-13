public enum CellStatus {
    EMPTY,
    X,
    O;

    public String getState() {
        switch (this) {
            case EMPTY:
                return " ";
            case X:
                return "X";
            case O:
                return "O";
            default:
                return null;
        }
    }
}
