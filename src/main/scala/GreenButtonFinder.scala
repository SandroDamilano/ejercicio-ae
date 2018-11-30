import java.io.File

import org.jsoup.Jsoup
import scala.collection.JavaConverters._

class GreenButtonFinder {

  def findIn(file: File): String = {
    val element = findElement(file)
    var parents = element.parents().asScala.reverse
    parents.map(element => element.nodeName())
      .reduceLeft((path, parent) => s"$path > $parent")
      .concat(" > " + element.first().nodeName())
  }

  def findElement(htmlFile: File)=  {
    Jsoup.parse(htmlFile, "utf8", htmlFile.getAbsolutePath)
      .select(".panel-body .btn-success")
  }

}
