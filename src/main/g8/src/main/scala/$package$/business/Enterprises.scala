package $package$.business

import com.innovenso.townplanner.model.EnterpriseArchitecture
import com.innovenso.townplanner.model.concepts.Enterprise
import com.innovenso.townplanner.model.concepts.properties.Description

case class Enterprises()(implicit
    ea: EnterpriseArchitecture
) {
  val $name;format="camel"$: Enterprise =
    ea describes Enterprise(title = "$name$") as { it =>
      it has Description(
        "$description$"
      )
    }
}
