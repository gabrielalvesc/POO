package com.ufpb.sanduiche;

public class LanchoneteCG extends SanduicheStore{

	@Override
	protected Sanduiche createSanduiche() {
		return new SanduicheCGStyle();
	}

}
