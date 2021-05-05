package com.star.epaves.services;
import com.star.epaves.entities.Epave;

public interface EpaveService {
	public Epave addepave (Epave epave);
	public Epave getEpaveById (Long id);
	public void deleteEpave (Epave epave);
}
