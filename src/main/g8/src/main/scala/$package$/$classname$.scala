package $package$

import com.innovenso.townplan.application.EnterpriseArchitectureAsCode
import $package$.business._
import $package$.views._

object $classname$ extends EnterpriseArchitectureAsCode {
  implicit val enterprises: Enterprises = Enterprises()
  implicit val globalViews: GlobalViews = GlobalViews()

  //generates diagrams for all views
  diagrams()
  //generates pdf documents using LaTeX
  documents()
  //exports the full town plan to OpenExchange XML
  archimate()
  //generates a static website of the full town plan
  website()
}
