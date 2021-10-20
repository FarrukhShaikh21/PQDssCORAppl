package pqt.dss.cor.view;

import javax.faces.application.FacesMessage;

import javax.faces.component.UISelectItems;
import javax.faces.context.FacesContext;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelLabelAndMessage;
import oracle.adf.view.rich.component.rich.layout.RichPanelStretchLayout;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;
import oracle.adf.view.rich.component.rich.output.RichSeparator;

import oracle.adf.view.rich.event.LaunchPopupEvent;
import oracle.adf.view.rich.event.ReturnPopupEvent;

import oracle.adfinternal.view.faces.model.binding.FacesCtrlLOVBinding;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import org.apache.myfaces.trinidad.component.UIXGroup;

public class corUpdateBean {
    private RichTable t1;
    private RichButton b1;
    private UIXGroup g1;
    private RichToolbar t2;
    private RichPanelCollection pc1;
    private RichSeparator s1;
    private RichSeparator s2;
    private RichInputText it2;
    private RichOutputText ot2;
    private RichPanelLabelAndMessage plam2;
    private RichInputListOfValues toManagerCodeId;
    private RichOutputText ot1;
    private RichPanelLabelAndMessage plam1;
    private RichInputListOfValues fromManagerCodeId;
    private RichInputListOfValues currentBranchNameId;
    private RichPanelFormLayout pfl1;
    private RichOutputText ot3;
    private RichPanelLabelAndMessage plam3;
    private RichPanelGroupLayout pgl1;
    private RichButton b3;
    private RichButton b2;
    private UIXGroup g2;
    private RichToolbar t3;
    private RichPanelHeader ph2;
    private RichPanelStretchLayout psl1;
    private RichInputDate id1;
    private RichSelectOneChoice soc1;
    private UISelectItems si1;
    private RichPanelGroupLayout pgl2;
    private RichOutputText ot4;
    private RichOutputText ot5;

    public corUpdateBean() {
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setG1(UIXGroup g1) {
        this.g1 = g1;
    }

    public UIXGroup getG1() {
        return g1;
    }

    public void setT2(RichToolbar t2) {
        this.t2 = t2;
    }

    public RichToolbar getT2() {
        return t2;
    }

    public void setPc1(RichPanelCollection pc1) {
        this.pc1 = pc1;
    }

    public RichPanelCollection getPc1() {
        return pc1;
    }

    public void setS1(RichSeparator s1) {
        this.s1 = s1;
    }

    public RichSeparator getS1() {
        return s1;
    }

    public void setS2(RichSeparator s2) {
        this.s2 = s2;
    }

    public RichSeparator getS2() {
        return s2;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setOt2(RichOutputText ot2) {
        this.ot2 = ot2;
    }

    public RichOutputText getOt2() {
        return ot2;
    }

    public void setPlam2(RichPanelLabelAndMessage plam2) {
        this.plam2 = plam2;
    }

    public RichPanelLabelAndMessage getPlam2() {
        return plam2;
    }

    public void setToManagerCodeId(RichInputListOfValues toManagerCodeId) {
        this.toManagerCodeId = toManagerCodeId;
    }

    public RichInputListOfValues getToManagerCodeId() {
        return toManagerCodeId;
    }

    public void setOt1(RichOutputText ot1) {
        this.ot1 = ot1;
    }

    public RichOutputText getOt1() {
        return ot1;
    }

    public void setPlam1(RichPanelLabelAndMessage plam1) {
        this.plam1 = plam1;
    }

    public RichPanelLabelAndMessage getPlam1() {
        return plam1;
    }

    public void setFromManagerCodeId(RichInputListOfValues fromManagerCodeId) {
        this.fromManagerCodeId = fromManagerCodeId;
    }

    public RichInputListOfValues getFromManagerCodeId() {
        return fromManagerCodeId;
    }

    public void setCurrentBranchNameId(RichInputListOfValues currentBranchNameId) {
        this.currentBranchNameId = currentBranchNameId;
    }

    public RichInputListOfValues getCurrentBranchNameId() {
        return currentBranchNameId;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setOt3(RichOutputText ot3) {
        this.ot3 = ot3;
    }

    public RichOutputText getOt3() {
        return ot3;
    }

    public void setPlam3(RichPanelLabelAndMessage plam3) {
        this.plam3 = plam3;
    }

    public RichPanelLabelAndMessage getPlam3() {
        return plam3;
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
    }

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }

    public void setG2(UIXGroup g2) {
        this.g2 = g2;
    }

    public UIXGroup getG2() {
        return g2;
    }

    public void setT3(RichToolbar t3) {
        this.t3 = t3;
    }

    public RichToolbar getT3() {
        return t3;
    }

    public void setPh2(RichPanelHeader ph2) {
        this.ph2 = ph2;
    }

    public RichPanelHeader getPh2() {
        return ph2;
    }

    public void setPsl1(RichPanelStretchLayout psl1) {
        this.psl1 = psl1;
    }

    public RichPanelStretchLayout getPsl1() {
        return psl1;
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String detailMandatory_action() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Apply");
        DCBindingContainer dcBindings = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding LineVO = (DCIteratorBinding) dcBindings.get("DssCorLineView2Iterator");

        if (LineVO.getEstimatedRowCount() == 0) {
            FacesMessage msg =
                new FacesMessage(FacesMessage.SEVERITY_ERROR,
                                 "Please add Agent detail", "");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } else {
            operationBinding.execute();
        }
        //        Object result = operationBinding.execute();
        //        if (!operationBinding.getErrors().isEmpty()) {
        //            return null;
        //        }
        return null;
    }


    public void setId1(RichInputDate id1) {
        this.id1 = id1;
    }

    public RichInputDate getId1() {
        return id1;
    }

    public void agentNoIdLaunchPopupEvent(LaunchPopupEvent launchPopupEvent) {
        // Add event code here...
        BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
                OperationBinding operation = bindings.getOperationBinding("searchAgents");
                Object VAgentCode = operation.execute();
                FacesCtrlLOVBinding lov = (FacesCtrlLOVBinding) bindings.get("AgentCode");
                String wcl = "V_AGENT_CODE NOT IN ("+ VAgentCode +")";
                lov.getListIterBinding().getViewObject().setWhereClause(wcl);
    }

    public void setSoc1(RichSelectOneChoice soc1) {
        this.soc1 = soc1;
    }

    public RichSelectOneChoice getSoc1() {
        return soc1;
    }

    public void setSi1(UISelectItems si1) {
        this.si1 = si1;
    }

    public UISelectItems getSi1() {
        return si1;
    }

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setOt4(RichOutputText ot4) {
        this.ot4 = ot4;
    }

    public RichOutputText getOt4() {
        return ot4;
    }

    public void setOt5(RichOutputText ot5) {
        this.ot5 = ot5;
    }

    public RichOutputText getOt5() {
        return ot5;
    }
}
