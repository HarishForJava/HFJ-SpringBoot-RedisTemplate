package com.hfj.bookmarker.repository.impl;

import java.util.Map;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.hfj.bookmarker.model.Bookmarker;
import com.hfj.bookmarker.repository.BookmarkerRepository;

/**
 * @author HFJ
 *
 */
@Repository
public class BookmarkerRepositoryImpl implements BookmarkerRepository {

	private RedisTemplate<String, Bookmarker> redisTemplate;

	private HashOperations hashOperations;

	public BookmarkerRepositoryImpl(RedisTemplate<String, Bookmarker> redisTemplate) {
		this.redisTemplate = redisTemplate;

		hashOperations = redisTemplate.opsForHash();
	}

	@Override
	public Bookmarker save(Bookmarker bookmarker) {
		hashOperations.put("BOOKMARKER", bookmarker.getId(), bookmarker);
		return (Bookmarker) hashOperations.get("BOOKMARKER", bookmarker.getId());
	}

	@Override
	public Map<String, Bookmarker> findAll() {
		return hashOperations.entries("BOOKMARKER");
	}

	@Override
	public Bookmarker findById(Long bookmarkerId) {
		return (Bookmarker) hashOperations.get("BOOKMARKER", bookmarkerId);
	}

	@Override
	public Bookmarker update(Bookmarker bookmarker) {
		return save(bookmarker);

	}

	@Override
	public Long delete(Long bookmarkerId) {
		return hashOperations.delete("BOOKMARKER", bookmarkerId);

	}

}
