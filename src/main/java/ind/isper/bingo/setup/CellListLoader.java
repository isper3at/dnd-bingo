package ind.isper.bingo.setup;

import java.nio.file.Path;
import java.util.Iterator;

/**
 * Loads the possible bingo cell list into an iterator.
 * 
 * The next() result will be randomly selected for ease
 * of generation of bingo sheet.  The iterator will
 * be lazily loaded, after a full load reset() will
 * allow all possible cells to be used again.
 */
public class CellListLoader implements Iterator<String> {
	public CellListLoader(final Path cellList) {
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		return null;
	}

}