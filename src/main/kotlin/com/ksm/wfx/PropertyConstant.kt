package com.ksm.wfx

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource
import java.io.IOException
import java.util.Properties

/*@ConfigurationProperties("spring.application")
class PropertyConstant {

  lateinit var name: String
  val banner = Banner()

  class Banner {
    var title: String? = null
    lateinit var content: String
  }

}*/
/*@Configuration
@PropertySource("classpath:application.properties")
open class PropertyConstant(){
	
}*/
object PropertyConstant {
   private lateinit var prop:Properties
  //-----------------------------------------------
  //webflix.propertis파일에 정의된 속성 상수. >>> 시작
  //-----------------------------------------------
  init{
    loadProperties()
  }

  var webflix = prop.getProperty("db1.url")
  var jndi_webflix = prop.getProperty("jndi_webflix")
  var jndi_webflix2 = prop.getProperty("jndi_webflix")

	
	/*
 db1.classname=com.mysql.jdbc.Driver
db1.database=mysql
db1.url=jdbc:mysql://localhost:3306/webflix?autoReconnect=true&useUnicode=true&characterEncoding=utf8
db1.username=root
db1.password=km911220
db1.maxIdle=20
db1.maxActive=5
db1.maxWait=10
db1.validationQuery=SELECT 1
 */
  /**
	 * properties를 로드한다.
	 */
  private fun loadProperties() {
    val inst = PropertyConstant::class.java!!.getResourceAsStream("/wfx.properties")
    try
    {
      prop = Properties()
      prop.load(inst)
    }
    catch (e:IOException) {
      e.printStackTrace()
    }
    finally
    {
      if (inst != null)
      {
        try
        {
         inst.close()
        }
        catch (e1:IOException) {}
      }
    }
  }
}