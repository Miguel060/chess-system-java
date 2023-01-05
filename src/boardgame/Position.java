package boardgame;

public class Position {
	private int row;
	private int column;
	public Position(int low, int column) {
		this.row = low;
		this.column = column;
	}
	public int getLow() {
		return row;
	}
	public void setLow(int low) {
		this.row = low;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	@Override
    public String toString() {
		return row + "," + column;
	}
	

}
