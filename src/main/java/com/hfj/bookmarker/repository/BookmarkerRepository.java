package com.hfj.bookmarker.repository;

import java.util.Map;

import com.hfj.bookmarker.model.Bookmarker;

/**
 * @author HFJ
 *
 */

public interface BookmarkerRepository {
	
	    Bookmarker save(Bookmarker user);
	    Map<String, Bookmarker> findAll();
	    Bookmarker findById(Long bookmarkerId);
	    Bookmarker update(Bookmarker user);
	    Long delete(Long bookmarkerId);

}
