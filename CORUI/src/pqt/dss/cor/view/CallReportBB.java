package pqt.dss.cor.view;

import javax.el.ELContext;

import javax.el.ExpressionFactory;

import javax.el.MethodExpression;

import javax.faces.context.FacesContext;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichQuery;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelStretchLayout;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;

import oracle.jbo.Row;

import org.apache.myfaces.trinidad.component.UIXGroup;

public class CallReportBB {
    private RichTable resId1;
    private RichButton b1;
    private UIXGroup g1;
    private RichToolbar t1;
    private RichPanelCollection pc1;
    private RichQuery qryId1;
    private RichPanelHeader ph1;
    private RichPanelGroupLayout pgl1;
    private RichPanelStretchLayout psl1;

    public CallReportBB() {
    }

    public void setResId1(RichTable resId1) {
        this.resId1 = resId1;
    }

    public RichTable getResId1() {
        return resId1;
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

    public void setT1(RichToolbar t1) {
        this.t1 = t1;
    }

    public RichToolbar getT1() {
        return t1;
    }

    public void setPc1(RichPanelCollection pc1) {
        this.pc1 = pc1;
    }

    public RichPanelCollection getPc1() {
        return pc1;
    }

    public void setQryId1(RichQuery qryId1) {
        this.qryId1 = qryId1;
    }

    public RichQuery getQryId1() {
        return qryId1;
    }

    public void setPh1(RichPanelHeader ph1) {
        this.ph1 = ph1;
    }

    public RichPanelHeader getPh1() {
        return ph1;
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setPsl1(RichPanelStretchLayout psl1) {
        this.psl1 = psl1;
    }

    public RichPanelStretchLayout getPsl1() {
        return psl1;
    }

    public String ReportCall() {
        BindingContext ctx = BindingContext.getCurrent();
        DCBindingContainer bc = (DCBindingContainer) ctx.getCurrentBindingsEntry();
        DCIteratorBinding iterator = bc.findIteratorBinding("DssCorHeaderView1Iterator");
        oracle.jbo.domain.Number ParameterId =
            (oracle.jbo.domain.Number) iterator.getCurrentRow().getAttribute("CorHeaderIdPk");

//        invokeEL("#{CallReport.callDSSReports('DSS_COR',ParameterId}", new Class[] { String.class, oracle.jbo.domain.Number.class },
//                 new Object[] { "First Param", "Second Param" });
        
        invokeEL("#{CallReportBB.callDSSReports}", new Class[] { String.class, oracle.jbo.domain.Number.class },
                 new Object[] {"DSS_COR", ParameterId});
        
        return null;
    }

    public void callDSSReports(String ReportCode, oracle.jbo.domain.Number ParameterId) {
        System.out.println(ReportCode + ParameterId);
    }

    public static Object invokeEL(String el) {
        return invokeEL(el, new Class[0], new Object[0]);
    }

    public static Object invokeEL(String el, Class[] paramTypes, Object[] params) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ELContext elContext = facesContext.getELContext();
        ExpressionFactory expressionFactory = facesContext.getApplication().getExpressionFactory();
        MethodExpression exp = expressionFactory.createMethodExpression(elContext, el, Object.class, paramTypes);

        return exp.invoke(elContext, params);
    }


}
