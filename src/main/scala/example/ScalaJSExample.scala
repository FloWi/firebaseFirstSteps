package example

import de.flwi.firebase._

import scala.scalajs.js

object ScalaJSExample extends js.JSApp {


  def main(): Unit = {

    val rootRef: Firebase = FirebaseFactory.create("https://gjauaudjwdc.firebaseio-demo.com/")

    rootRef.on1("value", callback = { (snapshot: FirebaseDataSnapshot) => {
      println(snapshot.value())
    } })

  }

}