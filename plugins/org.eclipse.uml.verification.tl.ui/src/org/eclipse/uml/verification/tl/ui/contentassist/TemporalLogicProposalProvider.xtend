/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.uml.verification.tl.ui.contentassist

import org.eclipse.xtext.RuleCall
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.uml.verification.helper.ElementName

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class TemporalLogicProposalProvider extends AbstractTemporalLogicProposalProvider {
	override complete_TEST(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.complete_TEST(model, ruleCall, context, acceptor)
		val loc = ElementName.getLocation()
		
		val list = ElementName.getList(loc);
		
		for (i : 0..<list.length) {
			acceptor.accept(createCompletionProposal(list.get(i), context))
		}
	}
	
}