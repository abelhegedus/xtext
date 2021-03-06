/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.ui.tests.editor.contentassist.contentAssistContextTest.ContentAssistContextTestPackage;
import org.eclipse.xtext.ui.tests.editor.contentassist.contentAssistContextTest.FirstLevel;
import org.eclipse.xtext.ui.tests.editor.contentassist.contentAssistContextTest.SecondLevelA;
import org.eclipse.xtext.ui.tests.editor.contentassist.contentAssistContextTest.SecondLevelB;
import org.eclipse.xtext.ui.tests.editor.contentassist.contentAssistContextTest.ThirdLevelA1;
import org.eclipse.xtext.ui.tests.editor.contentassist.contentAssistContextTest.ThirdLevelA2;
import org.eclipse.xtext.ui.tests.editor.contentassist.contentAssistContextTest.ThirdLevelB1;
import org.eclipse.xtext.ui.tests.editor.contentassist.contentAssistContextTest.ThirdLevelB2;
import org.eclipse.xtext.ui.tests.editor.contentassist.services.ContentAssistContextTestLanguageGrammarAccess;

@SuppressWarnings("all")
public class ContentAssistContextTestLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ContentAssistContextTestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ContentAssistContextTestPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ContentAssistContextTestPackage.FIRST_LEVEL:
				sequence_FirstLevel(context, (FirstLevel) semanticObject); 
				return; 
			case ContentAssistContextTestPackage.SECOND_LEVEL_A:
				sequence_SecondLevelA(context, (SecondLevelA) semanticObject); 
				return; 
			case ContentAssistContextTestPackage.SECOND_LEVEL_B:
				sequence_SecondLevelB(context, (SecondLevelB) semanticObject); 
				return; 
			case ContentAssistContextTestPackage.THIRD_LEVEL_A1:
				sequence_ThirdLevelA1(context, (ThirdLevelA1) semanticObject); 
				return; 
			case ContentAssistContextTestPackage.THIRD_LEVEL_A2:
				sequence_ThirdLevelA2(context, (ThirdLevelA2) semanticObject); 
				return; 
			case ContentAssistContextTestPackage.THIRD_LEVEL_B1:
				sequence_ThirdLevelB1(context, (ThirdLevelB1) semanticObject); 
				return; 
			case ContentAssistContextTestPackage.THIRD_LEVEL_B2:
				sequence_ThirdLevelB2(context, (ThirdLevelB2) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (secondLevelA+=SecondLevelA* secondLevelB+=SecondLevelB*)
	 */
	protected void sequence_FirstLevel(EObject context, FirstLevel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (thirdLevelA1+=ThirdLevelA1+ thirdLevelA2+=ThirdLevelA2+)
	 */
	protected void sequence_SecondLevelA(EObject context, SecondLevelA semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (thirdLevelB1+=ThirdLevelB1+ thirdLevelB2+=ThirdLevelB2+)
	 */
	protected void sequence_SecondLevelB(EObject context, SecondLevelB semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID?)
	 */
	protected void sequence_ThirdLevelA1(EObject context, ThirdLevelA1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID?)
	 */
	protected void sequence_ThirdLevelA2(EObject context, ThirdLevelA2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID?)
	 */
	protected void sequence_ThirdLevelB1(EObject context, ThirdLevelB1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID?)
	 */
	protected void sequence_ThirdLevelB2(EObject context, ThirdLevelB2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
