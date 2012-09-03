package com.wordpress.dojotuba;

import java.util.ArrayList;
import java.util.List;

public abstract class Elemento {

	private List<String> venceDe = new ArrayList<String>();

	public boolean venceDe(Elemento opcao) {
		if (this.venceDe.contains(opcao.toString()))
			return true;

		return false;
	}

	public List<String> getVenceDe() {
		return venceDe;
	}

	public void setVenceDe(List<String> venceDe) {
		this.venceDe = venceDe;
	}

	public String toString() {
		return this.getClass().getSimpleName();
	}

}
