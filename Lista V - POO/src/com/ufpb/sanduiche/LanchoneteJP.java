package com.ufpb.sanduiche;

public class LanchoneteJP extends SanduicheStore {

	@Override
	protected Sanduiche createSanduiche() {
		return new SanduicheJPStyle();
	}

}
