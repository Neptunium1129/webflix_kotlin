package com.ksm.wfx.jpa

import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

@Repository
interface MovieRepo : CrudRepository<Movie, Long>{
	//fun findByName(name:String) : Movie?
	
}