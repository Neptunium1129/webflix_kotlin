package com.ksm.wfx.datasource


import org.springframework.stereotype.Repository
import org.apache.ibatis.annotations.Mapper
import org.springframework.data.jpa.repository.Query
import com.ksm.wfx.jpa.Movie
import org.apache.ibatis.annotations.Select

@Repository
@Mapper
interface UserDao {
	@Select("select * from movie")
    fun findAll(): MutableList<Movie>
	
	fun find2() : MutableList<Movie>
	
	
}