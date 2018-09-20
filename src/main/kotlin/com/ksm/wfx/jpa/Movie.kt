package com.ksm.wfx.jpa

import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.validation.constraints.NotBlank
import javax.persistence.Column
import javax.persistence.Entity

@Entity
data class Movie (

		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="id", updatable=false, nullable=false)
		var id : Long = 0,
		
		@Column(name="title", updatable=false, nullable=false)
		var title : String = "",
		
		@Column(name="content", updatable=false, nullable=false)
		var content : String = ""

)