/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.uml.verification.tl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.uml.verification.tl.services.TemporalLogicGrammarAccess;
import org.eclipse.uml.verification.tl.temporalLogic.Import;
import org.eclipse.uml.verification.tl.temporalLogic.Model;
import org.eclipse.uml.verification.tl.temporalLogic.Property1;
import org.eclipse.uml.verification.tl.temporalLogic.Property2;
import org.eclipse.uml.verification.tl.temporalLogic.TemporalLogicPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class TemporalLogicSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TemporalLogicGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TemporalLogicPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TemporalLogicPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case TemporalLogicPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case TemporalLogicPackage.PROPERTY1:
				sequence_Property1(context, (Property1) semanticObject); 
				return; 
			case TemporalLogicPackage.PROPERTY2:
				sequence_Property2(context, (Property2) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     model=STRING
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TemporalLogicPackage.Literals.IMPORT__MODEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TemporalLogicPackage.Literals.IMPORT__MODEL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getModelSTRINGTerminalRuleCall_1_0(), semanticObject.getModel());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (location=Import | (location=Import (property1+=Property1 | property2+=Property2)+))?
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Option returns Property1
	 *     Property1 returns Property1
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             operator='AG' | 
	 *             operator='AF' | 
	 *             operator='EG' | 
	 *             operator='EF' | 
	 *             operator='NOT' | 
	 *             operator='G' | 
	 *             operator='F'
	 *         ) 
	 *         (modelElement1=TEST | next+=Option)
	 *     )
	 */
	protected void sequence_Property1(ISerializationContext context, Property1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Option returns Property2
	 *     Property2 returns Property2
	 *
	 * Constraint:
	 *     (modelElement1=TEST (operator='AND' | operator='OR' | operator='=>') (modelElement2=TEST | next=Option))
	 */
	protected void sequence_Property2(ISerializationContext context, Property2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
