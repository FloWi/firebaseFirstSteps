package de.flwi.firebase

import scala.scalajs.js
import scala.scalajs.js.annotation._

trait FirebaseAuthResult extends js.Object {
  var auth: js.Any = js.native
  var expires: Double = js.native
}

trait FirebaseDataSnapshot extends js.Object {
  def exists(): Boolean = js.native
  @JSName("val") def value(): js.Dynamic = js.native
  def child(childPath: String): FirebaseDataSnapshot = js.native
  def forEach(childAction: js.Function1[FirebaseDataSnapshot, Unit]): Boolean = js.native
  def hasChild(childPath: String): Boolean = js.native
  def hasChildren(): Boolean = js.native
  def key(): String = js.native
  def name(): String = js.native
  def numChildren(): Double = js.native
  def ref(): Firebase = js.native
  def getPriority(): js.Dynamic = js.native
  def exportVal(): Object = js.native
}

trait FirebaseOnDisconnect extends js.Object {
  def set(value: js.Any, onComplete: js.Function1[js.Any, Unit] = ???): Unit = js.native
  def setWithPriority(value: js.Any, priority: String, onComplete: js.Function1[js.Any, Unit] = ???): Unit = js.native
  def update(value: Object, onComplete: js.Function1[js.Any, Unit] = ???): Unit = js.native
  def remove(onComplete: js.Function1[js.Any, Unit] = ???): Unit = js.native
  def cancel(onComplete: js.Function1[js.Any, Unit] = ???): Unit = js.native
}

trait FirebaseQuery extends js.Object {
  @JSName("on") def on1(eventType: String, callback: js.Function1[FirebaseDataSnapshot, Unit], cancelCallback: js.Function1[js.Any, Unit] = ???, context: Object = ???): js.Function1[FirebaseDataSnapshot, Unit] = js.native
  @JSName("on") def on2(eventType: String, callback: js.Function2[FirebaseDataSnapshot, String, Unit], cancelCallback: js.Function1[js.Any, Unit] = ???, context: Object = ???): js.Function2[FirebaseDataSnapshot, String, Unit] = js.native
  def off(eventType: String = ???, callback: js.Function2[FirebaseDataSnapshot, String, Unit] = ???, context: Object = ???): Unit = js.native
  def once(eventType: String, successCallback: js.Function1[FirebaseDataSnapshot, Unit], context: Object = ???): Unit = js.native
  @JSName("once")def onceWithFailureCallback(eventType: String, successCallback: js.Function1[FirebaseDataSnapshot, Unit], failureCallback: js.Function1[js.Any, Unit] = ???, context: Object = ???): Unit = js.native
  def orderByChild(key: String): FirebaseQuery = js.native
  def orderByKey(): FirebaseQuery = js.native
  def orderByValue(): FirebaseQuery = js.native
  def orderByPriority(): FirebaseQuery = js.native
  def limit(limit: Double): FirebaseQuery = js.native
  def startAt(value: String, key: String = ???): FirebaseQuery = js.native
  def endAt(value: String, key: String = ???): FirebaseQuery = js.native
  def equalTo(value: String, key: String = ???): FirebaseQuery = js.native
  def limitToFirst(limit: Double): FirebaseQuery = js.native
  def limitToLast(limit: Double): FirebaseQuery = js.native
  def ref(): Firebase = js.native
}

trait FirebaseAuthData extends js.Object {
  var uid: String = js.native
  var provider: String = js.native
  var token: String = js.native
  var expires: Double = js.native
  var auth: Object = js.native
}

trait FirebaseCredentials extends js.Object {
  var email: String = js.native
  var password: String = js.native
}

trait FirebaseChangePasswordCredentials extends js.Object {
  var email: String = js.native
  var oldPassword: String = js.native
  var newPassword: String = js.native
}

trait FirebaseChangeEmailCredentials extends js.Object {
  var oldEmail: String = js.native
  var newEmail: String = js.native
  var password: String = js.native
}

trait FirebaseResetPasswordCredentials extends js.Object {
  var email: String = js.native
}

@JSName("Firebase")
trait Firebase extends FirebaseQuery {


  def auth(authToken: String, onComplete: js.Function2[js.Any, FirebaseAuthResult, Unit] = ???, onCancel: js.Function1[js.Any, Unit] = ???): Unit = js.native
  def authWithCustomToken(autoToken: String, onComplete: js.Function2[js.Any, FirebaseAuthData, Unit], options: Object = ???): Unit = js.native
  def authAnonymously(onComplete: js.Function2[js.Any, FirebaseAuthData, Unit], options: Object = ???): Unit = js.native
  def authWithPassword(credentials: FirebaseCredentials, onComplete: js.Function2[js.Any, FirebaseAuthData, Unit], options: Object = ???): Unit = js.native
  def authWithOAuthPopup(provider: String, onComplete: js.Function2[js.Any, FirebaseAuthData, Unit], options: Object = ???): Unit = js.native
  def authWithOAuthRedirect(provider: String, onComplete: js.Function1[js.Any, Unit], options: Object = ???): Unit = js.native
  def authWithOAuthToken(provider: String, credentials: String, onComplete: js.Function2[js.Any, FirebaseAuthData, Unit], options: Object = ???): Unit = js.native
  def child(childPath: String): Firebase = js.native
  def getAuth: FirebaseAuthData = js.native
  def onAuth(onComplete: js.Function1[FirebaseAuthData, Unit], context: Object = ???): Unit = js.native
  def offAuth(onComplete: js.Function1[FirebaseAuthData, Unit], context: Object = ???): Unit = js.native
  def unauth(): Unit = js.native
  def parent(): Firebase = js.native
  def root(): Firebase = js.native
  def key(): String = js.native
  def name(): String = js.native
  override def toString: String = js.native
  def update(value: Object, onComplete: js.Function1[js.Any, Unit] = ???): Unit = js.native
  def remove(onComplete: js.Function1[js.Any, Unit] = ???): Unit = js.native
  def push(value: js.Any = ???, onComplete: js.Function1[js.Any, Unit] = ???): Firebase = js.native
  def set(value: js.Any, onComplete: js.Function1[js.Any, Unit] = ???): Unit = js.native
  def setWithPriority(value: js.Any, priority: String, onComplete: js.Function1[js.Any, Unit] = ???): Unit = js.native
  def setPriority(priority: String, onComplete: js.Function1[js.Any, Unit] = ???): Unit = js.native
  def transaction(updateFunction: js.Function1[js.Any, Any], onComplete: js.Function3[js.Any, Boolean, FirebaseDataSnapshot, Unit] = ???, applyLocally: Boolean = ???): Unit = js.native
  def createUser(credentials: FirebaseCredentials, onComplete: js.Function1[js.Any, Unit]): Unit = js.native
  def changeEmail(credentials: FirebaseChangeEmailCredentials, onComplete: js.Function1[js.Any, Unit]): Unit = js.native
  def changePassword(credentials: FirebaseChangePasswordCredentials, onComplete: js.Function1[js.Any, Unit]): Unit = js.native
  def removeUser(credentials: FirebaseCredentials, onComplete: js.Function1[js.Any, Unit]): Unit = js.native
  def resetPassword(credentials: FirebaseResetPasswordCredentials, onComplete: js.Function1[js.Any, Unit]): Unit = js.native
  def onDisconnect(): FirebaseOnDisconnect = js.native

}

import scala.scalajs.js.Dynamic.{global => g, newInstance => jsnew}

@JSName("Firebase")
object FirebaseFactory {
  def create(url: String): Firebase = jsnew(g.Firebase)(url).asInstanceOf[Firebase]

//  def goOffline(): Unit = js.native // Firebase.goOffline()
//  def goOnline(): Unit = js.native  // Firebase.goOnline()
//  var ServerValue: js.Any = js.native // Firebase.ServerValue
}
