import java.io.File

import org.scalatest.FunSpec

class GreenButtonFinderSpec extends FunSpec {

  it("Finds the button in the original") {
    val originalFile = new File("/home/sdamilano/git/ejercicio-ae/Ejemplos/sample-0-origin.html")
    val greenButtonFinder = new GreenButtonFinder
    assert(greenButtonFinder.findIn(originalFile).equals("html > body > div > div > div > div > div > div > a"))
  }

  it("Finds the button in evil gemini") {
    val originalFile = new File("/home/sdamilano/git/ejercicio-ae/Ejemplos/sample-1-evil-gemini.html")
    val greenButtonFinder = new GreenButtonFinder
    assert(greenButtonFinder.findIn(originalFile).equals("html > body > div > div > div > div > div > div > a"))
  }

  it("Finds the button in container and clone") {
    val originalFile = new File("/home/sdamilano/git/ejercicio-ae/Ejemplos/sample-2-container-and-clone.html")
    val greenButtonFinder = new GreenButtonFinder
    assert(greenButtonFinder.findIn(originalFile).equals("html > body > div > div > div > div > div > div > div > a"))
  }

}
