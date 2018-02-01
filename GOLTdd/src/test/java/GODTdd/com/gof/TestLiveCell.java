package GODTdd.com.gof;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestLiveCell {
	@Test
    public void liveCellIsAlive() throws Exception {
        assertTrue(LiveCell.STATUS.isAlive());
    }

    @Test
    public void aLiveCellWithFewerThanTwoLiveNeighboursDies() throws Exception {
        Cell cell = LiveCell.STATUS.nextGeneration(1);
        assertFalse(cell.isAlive());
    }

    @Test
    public void aLiveCellWithMoreThanThreeLiveNeighboursDies() throws Exception {
        Cell cell = LiveCell.STATUS.nextGeneration(4);
        assertFalse(cell.isAlive());
    }

    @Test
    public void aLiveCellWithTwoOrThreeLiveNeighboursRemainsLive() throws Exception {
        assertTrue(LiveCell.STATUS.nextGeneration(2).isAlive());
    }
}
