package cn.edu.sujcc.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import cn.edu.sujcc.model.Channel;

public interface ChannelRepository extends MongoRepository<Channel,String>{
	List<Channel> findByTitleAndQuality(String t,String q);
	List<Channel> findByQuality(String q);
	List<Channel> findByTitle(String t);
	
	public Page<Channel> findByTitleContaining(String t, Pageable page);
	
	public List<Channel> findByCommentsDtAfter(LocalDateTime theDt);

}
