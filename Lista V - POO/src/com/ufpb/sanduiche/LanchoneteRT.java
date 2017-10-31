package com.ufpb.sanduiche;

public class LanchoneteRT extends SanduicheStore{

	@Override
	protected Sanduiche createSanduiche() {
		return new SanduicheRTStyle();
	}

}
