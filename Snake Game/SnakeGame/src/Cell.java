public class Cell {
    final static int CELL_TYPE_EMPTY=0,CELL_TYPE_FOOD=10,CELL_TYPE_SNAKE_NOODE=20;
    final int row ,col;
    int type;

    public Cell(int row, int col ){
        this.col=col;
        this.row=row;
    }
}
