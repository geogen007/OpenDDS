/*
 * (c) Copyright Object Computing, Incorporated. 2005,2010. All rights reserved.
 */
package org.opendds.modeling.model.opendds.diagram.dcpslib.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.opendds.modeling.model.opendds.OpenDDSPackage;
import org.opendds.modeling.model.opendds.diagram.dcpslib.edit.policies.DomainParticipantQoSPoliciesSharedCanonicalEditPolicy;
import org.opendds.modeling.model.opendds.diagram.dcpslib.edit.policies.DomainParticipantQoSPoliciesSharedItemSemanticEditPolicy;
import org.opendds.modeling.model.opendds.diagram.dcpslib.part.Messages;

/**
 * @generated
 */
public class DomainParticipantQoSPoliciesSharedEditPart extends
		ListCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7011;

	/**
	 * @generated
	 */
	public DomainParticipantQoSPoliciesSharedEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected boolean hasModelChildrenChanged(Notification evt) {
		return false;
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.DomainParticipantQoSPoliciesSharedEditPart_title;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new DomainParticipantQoSPoliciesSharedItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new DomainParticipantQoSPoliciesSharedCanonicalEditPolicy());
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		// nothing to do -- parent layout does not accept Double constraints as ratio
		// super.setRatio(ratio); 
	}

	/**
	 * Filter out policies that are in the same resource as the domain entity.
	 * @generated NOT
	 */
	@Override
	protected java.util.List getModelChildren() {
		EPackage dcpsLibsPackage = EPackage.Registry.INSTANCE.getEPackage(OpenDDSPackage.eNS_URI);
		EClass dcpsLibClass = (EClass) dcpsLibsPackage.getEClassifier("DcpsLib");
		
		return com.ociweb.gmf.edit.parts.ModelChildrenFilter
				.filterChildrenByOwner((View) getModel(), dcpsLibClass, super
						.getModelChildren());
	}

}