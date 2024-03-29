/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.uml.verification.tl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.uml.verification.tl.temporalLogic.Model
import org.eclipse.uml.verification.helper.LoadSelection

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class TemporalLogicGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val choice = LoadSelection.test(resource.URI);
		
		for (m: resource.allContents.toIterable.filter(Model)) {
			if (choice.equals("uppaal")) 
				fsa.generateFile("contents.txt", ruleGeneratorContentsUppaal(m))
			
			else if (choice.equals("nusmv")) 
				fsa.generateFile("contents.txt", ruleGeneratorContentsNusmv(m))
				
		    else if (choice.equals("spin")) 
				fsa.generateFile("contents.txt", ruleGeneratorContentsSpin(m))
			
			else if (choice.equals("pes")) 
				fsa.generateFile("contents.txt", ruleGeneratorContentsPes(m))
		}
	}

def ruleGeneratorContentsUppaal (Model m)'''
«FOR p:m.property1»
	«IF p.operator.equals("EF ")»
E<> xxxxx.calculating;«p.modelElement1»
	«ENDIF»
	«IF p.operator.equals("AG ")»
A[] xxxxx.calculating;«p.modelElement1»
	«ENDIF»
	«IF p.operator.equals("AF ")»
A<> xxxxx.calculating;«p.modelElement1»
	«ENDIF»
	«IF p.operator.equals("EG ")»
E[] xxxxx.calculating;«p.modelElement1»
	«ENDIF»
«ENDFOR»
«FOR p:m.property2»
xxxxx «p.operator» xxxxx;«p.modelElement1»;«p.modelElement2» 
«ENDFOR»
'''
def ruleGeneratorContentsNusmv (Model m)'''
«FOR p:m.property1»
	«IF p.operator.equals("EF ")»
CTLSPEC EF (outTxxxxx != 0);«p.modelElement1»
	«ENDIF»
	«IF p.operator.equals("AG ")»
CTLSPEC AG (outTxxxxx != 0);«p.modelElement1»
	«ENDIF»
	«IF p.operator.equals("AF ")»
CTLSPEC AF (outTxxxxx != 0);«p.modelElement1»
	«ENDIF»
	«IF p.operator.equals("EG ")»
CTLSPEC EG (outTxxxxx != 0);«p.modelElement1»
	«ENDIF»
«ENDFOR»
'''
def ruleGeneratorContentsSpin (Model m)'''
«FOR p:m.property1»
#define p«m.property1.indexOf(p)» (in_xxxxx >= yyyyy);«p.modelElement1»;«p.modelElement1»;«p.modelElement1»
«ENDFOR»
«FOR p:m.property1»
	«IF p.operator.equals("F ")»
ltl F«m.property1.indexOf(p)» { <><> p«m.property1.indexOf(p)» };«p.modelElement1»;«p.modelElement1»
	«ELSEIF p.operator.equals("G ")»
ltl F«m.property1.indexOf(p)»{ [][] p«m.property1.indexOf(p)» };«p.modelElement1»;«p.modelElement1»	
	«ENDIF»
«ENDFOR»
'''
	
def ruleGeneratorContentsPes (Model m)'''
«FOR p:m.property1»
	«IF p.operator.equals("EF ")»
«m.property1.indexOf(p)»: mu X«m.property1.indexOf(p)» = (pxxxxx == 1) || \exists time(\ExistAct(X«m.property1.indexOf(p)»));«p.modelElement1»
	«ENDIF»
	«IF p.operator.equals("AG ")»
«m.property1.indexOf(p)»: nu X«m.property1.indexOf(p)» = (pxxxxx == 1) && \forall time(\AllAct(X«m.property1.indexOf(p)»));«p.modelElement1»
	«ENDIF»
	«IF p.operator.equals("AF ")»
«m.property1.indexOf(p)»: mu X«m.property1.indexOf(p)» = (pxxxxx == 1) || (UnableWaitInf && \forall time(\AllAct(X«m.property1.indexOf(p)»)));«p.modelElement1»
	«ENDIF»
	«IF p.operator.equals("EG ")»
«m.property1.indexOf(p)»: nu X«m.property1.indexOf(p)» = (pxxxxx == 1) && (AbleWaitInf || \exists time(\ExistAct(X«m.property1.indexOf(p)»)));«p.modelElement1»
	«ENDIF»
«ENDFOR»
'''

}
