sealed trait Notification

case class EmailNotification(email: String, msg: String) extends Notification
case class SMSNotification(phone: String, msg: String) extends Notification
case class PushNotification(appname: String, msg : String) extends Notification
case object NoNotification extends Notification

object Notify extends App {
  def send (notification: Notification): String = notification match {
    case EmailNotification(e,n) => s"Sending EMAIL to $e : $n"
    case SMSNotification(p,m) => s"Sending SMS to $p: $m"
    case PushNotification(a,m) => s"Sending PUSH notification from $a : $m"
    case NoNotification => "You have no notifications as of now"
  }

  val myEmail = EmailNotification("abc123@gmail.com","Welcome!")
  val mySMS = SMSNotification("+91-7353627285","Your OTP is 1234")
  val myPush = PushNotification("Whatsapp","Hey! How are you?")

  println(send(myEmail))
  println(send(mySMS))
  println(send(myPush))
  println(send(NoNotification))
}

