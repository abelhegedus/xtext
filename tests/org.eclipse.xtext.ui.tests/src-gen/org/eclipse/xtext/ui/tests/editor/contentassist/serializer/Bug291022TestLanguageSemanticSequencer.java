/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug291022TestLanguage.Attribute;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug291022TestLanguage.Bug291022TestLanguagePackage;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug291022TestLanguage.ModelElement;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug291022TestLanguage.RootModel;
import org.eclipse.xtext.ui.tests.editor.contentassist.services.Bug291022TestLanguageGrammarAccess;

@SuppressWarnings("all")
public class Bug291022TestLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Bug291022TestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == Bug291022TestLanguagePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case Bug291022TestLanguagePackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case Bug291022TestLanguagePackage.MODEL_ELEMENT:
				sequence_ModelElement(context, (ModelElement) semanticObject); 
				return; 
			case Bug291022TestLanguagePackage.ROOT_MODEL:
				sequence_RootModel(context, (RootModel) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (feature=[ModelElement|ID] value=STRING)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Bug291022TestLanguagePackage.Literals.ATTRIBUTE__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug291022TestLanguagePackage.Literals.ATTRIBUTE__FEATURE));
			if(transientValues.isValueTransient(semanticObject, Bug291022TestLanguagePackage.Literals.ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug291022TestLanguagePackage.Literals.ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeAccess().getFeatureModelElementIDTerminalRuleCall_0_0_1(), semanticObject.getFeature());
		feeder.accept(grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (firstReference=[ModelElement|ID] name=ID? secondReference=[ModelElement|ID]? elements+=ModelAttribute*)
	 */
	protected void sequence_ModelElement(EObject context, ModelElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=[ModelElement|ID]? elements+=ModelAttribute*)
	 */
	protected void sequence_RootModel(EObject context, RootModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
