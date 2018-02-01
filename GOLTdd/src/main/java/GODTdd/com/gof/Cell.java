package GODTdd.com.gof;


public interface Cell {
    boolean isAlive();
    Cell nextGeneration(int liveNeighbours);
}
