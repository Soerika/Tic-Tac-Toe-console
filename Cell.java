public class Cell {
    CellStatus status = CellStatus.EMPTY;

    public void setStatus(CellStatus status) {
        this.status = status;
    }

    public CellStatus getStatus() {
        return status;
    }

    public boolean isEmpty() {
        return status == CellStatus.EMPTY;
    }
}
