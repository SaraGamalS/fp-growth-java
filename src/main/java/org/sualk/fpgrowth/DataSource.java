package org.sualk.fpgrowth;

public interface DataSource {

	public Transaction next();

	public boolean hasNext();

	public void reset();

}
