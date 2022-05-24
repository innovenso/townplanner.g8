package $package$.views

import $package$.business.Enterprises
import com.innovenso.townplanner.model.EnterpriseArchitecture
import com.innovenso.townplanner.model.concepts.views._

case class GlobalViews()(implicit
    ea: EnterpriseArchitecture,
    enterprises: Enterprises
) {
  ea needs TechnologyRadar(title = "$name$ Technology Radar")
  ea needs BusinessCapabilityMap(forEnterprise = enterprises.$name;format="camel"$)
  ea needs ArchitectureDecisionRecord()
  ea needs FullTownPlanView(forEnterprise = enterprises.$name;format="camel"$)
}
