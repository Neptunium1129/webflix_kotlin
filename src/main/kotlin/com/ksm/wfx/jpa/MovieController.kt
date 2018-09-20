package com.ksm.wfx.jpa

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping
import javax.validation.Valid
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping("/movie")
class MovieController (@Autowired val movRepo : MovieRepo) {
	
	@GetMapping("/save")
	fun createMovie(){
		
		val mov = Movie(
		1, "Rooper", "Action"
		)
		movRepo.save(mov)
		

		
	}
	
}