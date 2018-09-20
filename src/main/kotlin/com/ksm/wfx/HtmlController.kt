package com.ksm.wfx

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.env.Environment
import com.ksm.wfx.jpa.Movie
import com.ksm.wfx.datasource.UserDao
import com.ksm.wfx.jpa.MovieRepo

@Controller
class HtmlController ( val env : Environment
 ) {
	@Autowired
    private lateinit var userDao: UserDao
	@Autowired
    private lateinit var movRepo: MovieRepo
	
  @GetMapping("/test")
  fun blog(model: Model): String {


	model["result_env"] = env.getProperty("spring.banner.charset")
	model["result"] =PropertyConstant.webflix
    model["title"] = "Blog"
	  
	  
    return "th_blog1"
  }
	
	@GetMapping("/t1")
	fun t1 (model : Model,
            mov : Movie
			) : String {
	
		System.out.println(userDao.find2())
		System.out.println(userDao.findAll())
		
		var A : MutableList<Movie> = (userDao.findAll())
		System.out.println(A.get(0).title)
		
	
    //	System.out.println(">>@@@>@@@>"+TestList.size());
		mov.title="신과함께2"
		mov.content="하정우"
		//movRepo.save(mov)
			var B : String = if(mov.title == "Rooper") "루퍼" else "NOP"
		System.out.println(B)
	
		System.out.println(mov.title)
		
	
		model["test"]="aaa"
		model["test2"]="asdasdasdasdasd"
		
		return "th_blog1"
	}
	


}