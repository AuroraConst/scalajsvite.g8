
package $organization$

import sttp.client4.quick.*
import sttp.client4.Response
import zio.json.*
import org.scalajs.dom


import org.scalajs.macrotaskexecutor.MacrotaskExecutor.Implicits.global


object httpclient:
  def getexample() = 
    quickRequest.get(uri"http://httpbin.org/ip").send()
    .map{response => dom.window .alert(s"Response: \${response.body}") }
  
