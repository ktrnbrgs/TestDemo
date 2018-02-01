package GODTdd.com.gof;

public class DeadCell implements Cell {
	public static final Cell STATUS = new DeadCell();
			
	private DeadCell() {
    }

    public boolean isAlive() {
        return false;
    }

    public Cell nextGeneration(int liveNeighbours) {
        if (liveNeighbours == 3) {
            return LiveCell.STATUS;
        }
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        DeadCell cell = (DeadCell) obj;
        return isAlive() == cell.isAlive();
    }

}
